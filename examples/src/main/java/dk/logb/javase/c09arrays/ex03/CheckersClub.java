package dk.logb.javase.c09arrays.ex03;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * A membership system that uses ArrayList and arrays badly
 */
public class CheckersClub {
	private static final int NUM_BOARDS = 4;
	private String name;
	private String[] members;
	private ArrayList<String> boards = new ArrayList<String>();
	
	public CheckersClub(String name, String[] members) {
		this.name = name;
		this.members = new String[members.length];
		System.arraycopy(members, 0, this.members, 0, members.length);
		for (int i = 0; i < NUM_BOARDS; i++) {
			boards.add("None");
		}
	}

	public void addMember(String member) {
		if (member == null) {
			return;
		}
		String[] old = members;
		members = new String[old.length+1];
		System.arraycopy(old, 0, members, 0, old.length);
		members[members.length-1] = member;
		Arrays.sort(members);
	}	

	public void removeMember(String member) {
		String[] old = members;
		members = new String[0];		
		for (int i = 0; i < old.length; i++) {
			if (!old[i].equals(member)) {
				addMember(old[i]);
			}
		}
		removeFromBoards(member);
	}

	public void addBoardPosition(String member, int position) {
		if(position < 1 || position > NUM_BOARDS) {
			System.out.println("Bad position: "+position);
			return;
		}
		if (!isMember(member)) {
			System.out.println("Not a member: "+ member);
			return;
		}
		boards.set(position - 1, member);
	}
	
	private boolean isMember(String member) {
		for (int i = 0; i < members.length; i++) {
			if (members[i].equals(member)) {
				return true;
			}
		}
		return false;
	}	
	
	public void removeFromBoards(String member) {
		if (boards.contains(member)) {
			boards.set(boards.indexOf(member), "None");			
		}
	}

	@Override
	public String toString() {
		return "CheckersClub [name=" + name + ", members=" + Arrays.toString(members) + ", boards=" + boards + "]";
	}
}
