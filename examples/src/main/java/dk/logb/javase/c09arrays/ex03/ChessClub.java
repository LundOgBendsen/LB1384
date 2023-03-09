package dk.logb.javase.c09arrays.ex03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


/**
 * A membership system that uses arrays and ArrayList correctly
 */
public class ChessClub {
	private static final int NUM_BOARDS = 4;
	private String name;
	private ArrayList<String> members;
	private String[] boards = new String[NUM_BOARDS];
	
	public ChessClub(String name, ArrayList<String> members) {
		this.name = name;
		this.members = new ArrayList<>(members);
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
		
	public void addBoardPosition(String member, int position) {
		if(position < 1 || position > NUM_BOARDS) {
			System.out.println("Bad position: "+position);
			return;
		}
		if (!members.contains(member)) {
			System.out.println("Not a member: "+ member);
			return;
		}
		boards[position - 1] = member;
	}

	public void removeFromBoards(String member) {
		for (int i = 0; i < boards.length; i++) {
			if (boards[i].equals(member)) {
				boards[i] = null;
			}
		}
	}

	@Override
	public String toString() {
		return "ChessClub [name=" + name + ", members=" + members + ", boards=" + Arrays.toString(boards) + "]";
	}
}
