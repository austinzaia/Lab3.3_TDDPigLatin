import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PigLatinTest {
	//given examples
	@Test
	void test1() {
		String expected = "appleway";
		String actual = PigLatin.translate("apple");
		assertEquals(expected, actual);
	}
	@Test
	void test2() {
		String expected = "elseway";
		String actual = PigLatin.translate("else");
		assertEquals(expected, actual);
	}
	@Test
	void test3() {
		String expected = "iraffegay";
		String actual = PigLatin.translate("giraffe");
		assertEquals(expected, actual);
	}
	//starting with vowels
	@Test
	void test4() {
		String expected = "apooway";
		String actual = PigLatin.translate("apoo");
		assertEquals(expected, actual);
	}
	@Test
	void test5() {
		String expected = "eustassway";
		String actual = PigLatin.translate("eustass");
		assertEquals(expected, actual);
	}
	@Test
	void test6() {
		String expected = "isshoway";
		String actual = PigLatin.translate("issho");
		assertEquals(expected, actual);
	}
	@Test
	void test7() {
		String expected = "oarsway";
		String actual = PigLatin.translate("oars");
		assertEquals(expected, actual);
	}
	@Test
	void test8() {
		String expected = "usoppway";
		String actual = PigLatin.translate("usopp");
		assertEquals(expected, actual);
	}
	//starting with one consonant
	@Test
	void test9() {
		String expected = "epobay";
		String actual = PigLatin.translate("bepo");
		assertEquals(expected, actual);
	}
	@Test
	void test10() {
		String expected = "aesarcay";
		String actual = PigLatin.translate("caesar");
		assertEquals(expected, actual);
	}
	//starting with two consonants
	@Test
	void test11() {
		String expected = "aculedray";
		String actual = PigLatin.translate("dracule");
		assertEquals(expected, actual);
	}
	//starting with three consonants
	@Test
	void test12() {
		String expected = "ogyray";
		String actual = PigLatin.translate("gyro");
		assertEquals(expected, actual);
	}
	//lower case conversion
	@Test
	void test13() {
		String expected = "iratepay";
		String actual = PigLatin.translate("PIRATE");
		assertEquals(expected, actual);
	}
}
