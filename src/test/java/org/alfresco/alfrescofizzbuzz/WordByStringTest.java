package org.alfresco.alfrescofizzbuzz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WordByStringTest {

	@Test
	void testMyWorld() {
		WordByString wbs = new WordByString("alfresco","3");
		
		String result = wbs.myWord(13);
		assertEquals("alfresco", result);
		assertTrue(wbs.isFoundWhenStringType());
		
		result = wbs.myWord(12);
		assertEquals("", result);
		assertFalse(wbs.isFoundWhenStringType());
	}

}
