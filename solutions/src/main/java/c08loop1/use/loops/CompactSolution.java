package c08loop1.use.loops;
/**
 * This is a more compact solution to the oop1 exercise 
 *
 */
public class CompactSolution {
	public static void main(String[] args) {
		// n is the height of both triangles
		int n = 10;
		
		//make the top-heavy triangle with a for loop
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//make the bottom-heavy triangle with a while loop
		int i = 0;
		while (i++ < n) {
			int j = 0;
			while (j++ < n) {
				if (j <= n-i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
