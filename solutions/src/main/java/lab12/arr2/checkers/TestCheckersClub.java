package lab12.arr2.checkers;

import java.util.ArrayList;
import java.util.List;

public class TestCheckersClub {
	public static void main(String[] args) {
		CheckersClub cc = new CheckersClub("The Checksters", new ArrayList<>(List.of("Adam", "Charlotte", "David")));
		System.out.println(cc);
		cc.addBoardPosition("Adam", 1);
		System.out.println(cc);
		cc.addBoardPosition("Adam", 0);
		System.out.println(cc);
		cc.addBoardPosition("Adam", 5);
		System.out.println(cc);
		cc.addBoardPosition("Bobby", 2);
		System.out.println(cc);
		cc.addBoardPosition("Charlotte", 3);
		System.out.println(cc);
		cc.addBoardPosition("David", 4);
		System.out.println(cc);
		cc.addMember(null);
		System.out.println(cc);
		cc.addMember("Brenda");
		System.out.println(cc);
		cc.addBoardPosition("Brenda", 2);
		System.out.println(cc);
		cc.removeMember("Adam");
		System.out.println(cc);

	}
}
