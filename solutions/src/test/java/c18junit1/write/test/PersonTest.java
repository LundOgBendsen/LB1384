package c18junit1.write.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class PersonTest {

	@Test
	void testGetAgeAt() {
		LocalDate birthDay = LocalDate.of(1970, 5, 13);
		LocalDate testDay = LocalDate.of(2021, 4, 13);
		Person p =  new Person(birthDay);
		assertEquals(50, p.getAgeAt(testDay));
		testDay = LocalDate.of(2021, 5, 13);
		assertEquals(51, p.getAgeAt(testDay));
		testDay = LocalDate.of(2021, 6, 13);
		assertEquals(51, p.getAgeAt(testDay));
	}

}