package c08loop1.use.loops;

public class CompactSolution {
	public static void main(String[] args) {
		int n = 10;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
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
