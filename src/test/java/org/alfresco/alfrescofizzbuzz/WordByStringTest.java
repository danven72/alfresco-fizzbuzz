package org.alfresco.alfrescofizzbuzz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WordByStringTest {

	@Test
	void testMyWorld() {
		WordByString wbs = new WordByString("alfresco","3");
		
		WordByTypeResult result = wbs.myWord(13);
		assertEquals("alfresco", result.getWordResult());
		assertTrue(result.isForceBreak());
		
		result = wbs.myWord(12);
		assertEquals("", result.getWordResult());
		assertFalse(result.isWordFound() && result.isForceBreak());
	}

}
