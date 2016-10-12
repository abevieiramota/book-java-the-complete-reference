package com.abevieiramota.ch17;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class CharacterClass {
	
	@Test
	public void testCharacter() {
		System.out.println(Character.isDefined('&'));
		System.out.println(Character.isDigit('.'));
		System.out.println(Character.isIdentifierIgnorable(' '));
		System.out.println(Character.isISOControl('~'));
		System.out.println(Character.isJavaIdentifierPart('['));
		System.out.println(Character.isJavaIdentifierStart('_'));
		System.out.println(Character.isLetter('a'));
		System.out.println(Character.isLetterOrDigit('4'));
		System.out.println(Character.isLowerCase('b'));
		System.out.println(Character.isMirrored('('));
		System.out.println(Character.isSpaceChar(' '));
		System.out.println(Character.isTitleCase('l'));
		System.out.println(Character.isUnicodeIdentifierPart('u'));
		System.out.println(Character.isUnicodeIdentifierStart('\\'));
		System.out.println(Character.isUpperCase('M'));
		System.out.println(Character.isUpperCase('['));
		System.out.println(Character.isLowerCase('['));
		System.out.println(Character.isWhitespace('\n'));
		System.out.println(Character.toLowerCase('M'));
		System.out.println(Character.toUpperCase('ç'));
	}

}
