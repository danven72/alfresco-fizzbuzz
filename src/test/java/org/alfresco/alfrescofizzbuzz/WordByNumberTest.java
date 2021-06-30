package org.alfresco.alfrescofizzbuzz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WordByNumberTest {

	@Test
	void testMyWorld() {
		WordByNumber wbn = new WordByNumber("fizz",3);
		
		WordByTypeResult result = wbn.myWord(3);
		assertEquals("fizz", result.getWordResult());
		assertFalse(result.isForceBreak());
		
		result = wbn.myWord(11);
		assertEquals("", result.getWordResult());
		assertFalse(result.isForceBreak());
	}

}
