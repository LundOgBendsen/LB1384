package c09arr3.define.cup;

public class RollResult {

	int[] results;

	RollResult(final int[] results) {
		this.results = results;
	}

	int getTotal() {
		int total = 0;
		for (int n = 0; n < results.length; n++) {
			total += results[n];
		}
		return total;
	}

	int getRollOfDie(final int dieNumber) {
		return results[dieNumber];
	}

	@Override
	public String toString() {
		// construct String of the form
		// [RollResult[3,4,3,1,6,6]]
		String s = "RollResult[";
		for (int n = 0; n < results.length; n++) {
			if (n == 0) {
				// no ',' in front of first roll
				s += "" + results[n];
			} else {
				s += ", " + results[n];
			}
		}
		s += "]";
		return s;
	}
}
