package dk.logb.javase.c16interfaces.ex01;

/*
 * Demonstrates implementation of interfaces and how to use polymorphic references
 */
import java.util.ArrayList;

public class MessageTester {
	ArrayList<MessageListener> messageListeners = new ArrayList<>();

	void sendMessage(final String message) {
		for (MessageListener ml : messageListeners) {
			ml.message(message);
		}
	}

	public static void main(final String[] args) {
		MessageTester messageTester = new MessageTester();
		messageTester.messageListeners.add(new MessageRecorder());
		messageTester.messageListeners.add(new MessageRecorder());
		messageTester.messageListeners.add(new MessageEcho());
		System.out.println("Sender message: 'Hello'");
		messageTester.sendMessage("Hello");
		System.out.println("Sender message: 'my'");
		messageTester.sendMessage("my");
		System.out.println("Sender message: 'friend'");
		messageTester.sendMessage("friend");

		System.out.println();
		System.out.println("Printing listeners");

		for (MessageListener ml : messageTester.messageListeners) {
			System.out.println(ml);
		}
	}
}

interface MessageListener {
	public void message(String message);
}

class MessageRecorder implements MessageListener {
	ArrayList<String> messages = new ArrayList<>();

	@Override
	public void message(final String message) {
		messages.add(message);
	}

	@Override
	public String toString() {
		return "MessageRecorder" + messages;
	}
}

class MessageEcho implements MessageListener {
	@Override
	public void message(final String message) {
		for (int n = 0; n < 5; n++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// Nothing to do
			}
			System.out.println(message);
		}
	}

	@Override
	public String toString() {
		return "MessageEcho[ready to echo your messages]";
	}
}
