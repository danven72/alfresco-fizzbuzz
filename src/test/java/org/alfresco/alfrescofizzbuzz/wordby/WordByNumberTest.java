package org.alfresco.alfrescofizzbuzz.wordby;

import static org.junit.jupiter.api.Assertions.*;

import org.alfresco.alfrescofizzbuzz.model.WordByTypeResult;
import org.alfresco.alfrescofizzbuzz.wordby.WordByNumber;
import org.junit.jupiter.api.Test;

class WordByNumberTest {

	@Test
	void testMyWorld() {
		WordByNumber wbn = new WordByNumber("fizz",3, false);
		
		WordByTypeResult result = wbn.myWord(3);
		assertEquals("fizz", result.getWordResult());
		assertFalse(result.isForceBreak());
		
		result = wbn.myWord(11);
		assertEquals("", result.getWordResult());
		assertFalse(result.isForceBreak());
	}

}
