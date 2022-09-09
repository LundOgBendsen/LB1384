package dk.logb.javase.c10strings.ex01;

import java.text.Collator;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/**
 * Demonstrates how character collation is a necessary concept when sorting strings and how
 * java.text.Collator and java.util.Locale can help achieve correct sorting.
 * 
 * This is a real world problem that has stumped experienced developers for days!
 *
 */
public class CharacterCollation {
	public static void main(String[] args) {
		/* Create a list of strings that we will want to sort */
		List<String> a = Arrays.asList("Årslev", "Ejby", "Ésbjerg", "Exby", "Aarhus", "Ålby", "Asnæs");
		
		/* Sort the strings using the default collation and print them */
		Collections.sort(a);
		System.out.println(a);
		
		System.out.println();
		
		/* Now create a Danish Collator and sort the strings with it */
		Collator col = Collator.getInstance(new Locale("da", "DK"));
		Collections.sort(a, col);
		System.out.println(a);
		
		/* Note that É is now considered equivalent to E and Aa to Å */

	}

}
