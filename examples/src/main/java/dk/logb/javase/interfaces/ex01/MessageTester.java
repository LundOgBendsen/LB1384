package dk.logb.javase.interfaces.ex01;

/*
 * Illustrerer implementation af interfaces
 * og at man vha. en reference af en interfacetype
 * kan opn� polymorfi (lin 12+13)
 */
import java.util.ArrayList;

public class MessageTester
{
  ArrayList<MessageListener> messageListeners = new ArrayList<MessageListener>();

  void sendMessage(final String message)
  {
    for (MessageListener ml : messageListeners)
    {
      ml.message(message);
    }
  }

  public static void main(final String[] args)
  {
    MessageTester messageTester = new MessageTester();
    messageTester.messageListeners.add(new MessageRecorder());
    messageTester.messageListeners.add(new MessageRecorder());
    messageTester.messageListeners.add(new MessageEcho());
    System.out.println("Sender message: 'hej'");
    messageTester.sendMessage("Hej");
    System.out.println("Sender message: 'med'");
    messageTester.sendMessage("med");
    System.out.println("Sender message: 'dig'");
    messageTester.sendMessage("dig");

    System.out.println();
    System.out.println("Udskriver listeners");

    for (MessageListener ml : messageTester.messageListeners)
    {
      System.out.println(ml);
      ;
    }
  }
}

interface MessageListener
{
  public void message(String message);
}

class MessageRecorder implements MessageListener
{
  ArrayList<String> messages = new ArrayList<String>();

  @Override
  public void message(final String message)
  {
    messages.add(message);
  }

  @Override
  public String toString()
  {
    return "MessageRecorder" + messages;
  }
}

class MessageEcho implements MessageListener
{
  @Override
  public void message(final String message)
  {
    for (int n = 0; n < 5; n++)
    {
      try
      {
        Thread.sleep(500);
      }
      catch (Exception e)
      {
      }
      System.out.println(message);
    }
  }

  @Override
  public String toString()
  {
    return "MessageEcho[ready to echo your messages]";
  }
}
