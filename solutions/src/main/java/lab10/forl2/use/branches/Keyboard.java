package lab10.forl2.use.branches;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Keyboard {
	public static String readLine() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		try {
			line = br.readLine();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return line;
	}
}
