package lab12.arr2.checkers;

import java.util.ArrayList;
import java.util.Collections;

public class CheckersClub {
	private static final int NUM_BOARDS = 4;
	private String name;
	private ArrayList<String> members;
	private ArrayList<String> boards = new ArrayList<String>();
	
	public CheckersClub(String name, ArrayList<String> members) {
		this.name = name;
		this.members = members;
		for (int i = 0; i < NUM_BOARDS; i++) {
			boards.add("None");
		}
	}
	public void addBoardPosition(String member, int position) {
		if(position < 1 || position > NUM_BOARDS) {
			System.out.println("Bad position: "+position);
			return;
		}
		if (!members.contains(member)) {
			System.out.println("Not a member: "+ member);
			return;
		}
		boards.set(position - 1, member);
	}
	
	
	public void addMember(String member) {
		if (member == null) {
			return;
		}
		members.add(member);
		Collections.sort(members);
	}
	public void removeMember(String member) {
		members.remove(member);
		removeFromBoards(member);
	}
		
	public void removeFromBoards(String member) {
		if (boards.contains(member)) {
			boards.set(boards.indexOf(member), "None");			
		}
	}

	@Override
	public String toString() {
		return "CheckersClub [name=" + name + ", members=" + members + ", boards=" + boards + "]";
	}
}
