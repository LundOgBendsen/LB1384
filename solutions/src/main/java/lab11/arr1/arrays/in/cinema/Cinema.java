package lab11.arr1.arrays.in.cinema;

public class Cinema {
	
	private final char [][] seats;
	
	public Cinema(final int noOfRows, final int noOfSeats){
		seats = new char[noOfRows][noOfSeats];
		for(char[] c: seats){
			for(int i = 0; i < c.length; i++){
				c[i] = '.';
			}
		}
	}
	
	public boolean reserveSeat(final int row, final int no){
		if(seats[row][no] != 'R'){
			seats[row][no] = 'R';
			return true;
		}
		return false;
	}
	
	public int emptySeats(){
		int count = 0;
		for(char[] c: seats){
			for(char s : c){
				if(s == '.')
					count++;
			}
		}
		return count;
	}
	
	public void cancelSeat(final int row, final int no){
    seats[row][no] = '.';
	}
	
	@Override
  public String toString(){
		String result = "";
		for(char[] c: seats){
			for(char s : c){
				result += ("|" + s + "|");
			}
			result += "\n";
		}
		return result;
	}
	

}
