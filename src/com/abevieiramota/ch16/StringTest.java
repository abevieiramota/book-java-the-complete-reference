package com.abevieiramota.ch16;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class StringTest {

	@Test
	public void testStringFromCharArr() {
		char[] nome = { 'a', 'b', 'e', 'l', 'a', 'r', 'd', 'o' };

		assertEquals("abelardo", new String(nome));
	}

	@Test
	public void testStringLength() {
		String ab = "abelardo";

		assertEquals(8, ab.length());
	}

	@Test
	public void concatCallToString() {
		MeChame meChame = new MeChame();
		String a = "" + meChame;
		assertEquals(1, meChame.qtdMeChamaram);
	}

	@Test
	public void charAtOk() {
		assertEquals('b', "abelardo".charAt(1));
	}

	@Test(expected = StringIndexOutOfBoundsException.class)
	public void charAtNegativeIndex() {
		"abelardo".charAt(-1);
	}

	@Test(expected = StringIndexOutOfBoundsException.class)
	public void charAtIndexAcima() {
		"abelardo".charAt(10);
	}

	@Test
	public void getChars() {
		char[] vemCa = new char[6];
		"abelardo".getChars(2, 8, vemCa, 0);
		assertEquals("elardo", new String(vemCa));
	}

	@Test
	public void getCharsTargetIndex() {
		char[] vemCa = new char[7];
		vemCa[0] = 'P';
		"abelardo".getChars(2, 8, vemCa, 1);
		assertEquals("Pelardo", new String(vemCa));
	}

	@Test
	public void testEqualsIgnoreCase() {
		String nome = "Abelardo";
		String toMinusculo = "abelardo";

		assertTrue(nome.equalsIgnoreCase(toMinusculo));
		assertTrue(toMinusculo.equalsIgnoreCase(nome));
	}

	@Test
	public void testRegionMatches() {
		String firstName = "Abelardo";
		String fullName = "abelardo Vieira Mota";

		assertTrue(fullName.regionMatches(true, 0, firstName, 0, 8));
	}

	@Test
	public void testStartsWith() {
		String secondtName = "Vieira";
		String fullName = "abelardo Vieira Mota";

		assertTrue(fullName.startsWith(secondtName, 9));
	}

	@Test
	public void testIntern() {
		String nome1 = "Abelardo";
		String nome2 = new String("Abelardo").intern();

		assertTrue(nome1 == nome2);
	}

	@Test
	public void testNoIntern() {
		String nome1 = "Abelardo";
		String nome2 = new String("Abelardo");

		assertTrue(nome1 != nome2);
	}

	@Test
	public void testSort() {
		String[] meuNome = { "Abelardo", "Vieira", "Mota" };
		Arrays.sort(meuNome);

		assertArrayEquals(new String[] { "Abelardo", "Mota", "Vieira" }, meuNome);
	}

	@Test
	public void testIndexOf() {
		String nome = "Abelardo Vieira Motalardo";

		assertEquals(3, nome.indexOf("lardo"));
		assertEquals(20, nome.indexOf("lardo", 10));
	}

	@Test
	public void testLastIndexOf() {
		String nome = "Abelardo Vieira Motalardo";

		assertEquals(20, nome.lastIndexOf("lardo"));
		assertEquals(3, nome.lastIndexOf("lardo", 10));
	}

	@Test
	public void testSubstring() {
		String nome = "Abelardo Vieira Motalardo";

		assertEquals("Abelardo", nome.substring(0, 8));
	}
	
	@Test
	public void testReplace() {
		String abcd = "abcdefghia";
		
		assertEquals("!bcdefghi!", abcd.replace('a', '!'));
		assertEquals("yyyyefghia", abcd.replace("abcd", "yyyy"));
	}
}
