package c09arr1.chess.club;

public class TestChessClub {
	public static void main(String[] args) {
		String[] initialMembers = {"Adam", "Charlotte", "David"};
		ChessClub cc = new ChessClub("The Chessters", initialMembers);
		System.out.println(cc);
		cc.addMember(null);
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
		cc.addMember("Brenda");
		System.out.println(cc);
		cc.addBoardPosition("Brenda", 2);
		System.out.println(cc);
		cc.removeMember("Adam");
		System.out.println(cc);

	}
}
