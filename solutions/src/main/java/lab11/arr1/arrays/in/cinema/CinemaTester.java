package lab11.arr1.arrays.in.cinema;

public class CinemaTester {
	
	public static void main(String[] args){
		Cinema bioGrande = new Cinema (10, 20);
	
		System.out.println(bioGrande);
		
		bioGrande.reserveSeat(9, 4);
		bioGrande.reserveSeat(9, 5);
		bioGrande.reserveSeat(9, 6);
		
		System.out.println(bioGrande);
		
		System.out.println("Ledige pladser: " + bioGrande.emptySeats());
	}

}
