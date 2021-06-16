package org.alfresco.alfrescofizzbuzz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WordByNumberTest {

	@Test
	void testMyWorld() {
		WordByNumber wbn = new WordByNumber("fizz",3);
		
		String result = wbn.myWord(3);
		assertEquals("fizz", result);
		assertFalse(wbn.isFoundWhenStringType());
		
		result = wbn.myWord(11);
		assertEquals("", result);
		assertFalse(wbn.isFoundWhenStringType());
	}

}
