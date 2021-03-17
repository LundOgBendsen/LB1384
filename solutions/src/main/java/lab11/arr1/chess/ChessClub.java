package lab11.arr1.chess;

import java.util.Arrays;

public class ChessClub {
	private static final int NUM_BOARDS = 4;
	private String name;
	private String[] members;
	private String[] boards = new String[NUM_BOARDS];
	
	public ChessClub(String name, String[] members) {
		this.name = name;
		this.members = members;
	}
	
	public void addBoardPosition(String member, int position) {
		if(position < 1 || position > boards.length) {
			System.out.println("Bad position: "+position);
			return;
		}
		if (!isMember(member)) {
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
		
	private boolean isMember(String member) {
		for (int i = 0; i < members.length; i++) {
			if (members[i].equals(member)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "ChessClub [name=" + name + ", members=" + Arrays.toString(members) + ", boards="
				+ Arrays.toString(boards) + "]";
	}

}
