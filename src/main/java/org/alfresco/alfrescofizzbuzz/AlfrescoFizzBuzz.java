package org.alfresco.alfrescofizzbuzz;

import org.alfresco.alfrescofizzbuzz.processor.AbstractNumberToWordProcessor;
import org.alfresco.alfrescofizzbuzz.wordby.WordByNumber;
import org.alfresco.alfrescofizzbuzz.wordby.WordByString;

public class AlfrescoFizzBuzz extends AbstractNumberToWordProcessor {

	public AlfrescoFizzBuzz() {
		
		super(new WordByString("alfresco", "3", true), new WordByNumber("fizz", 3, false), new WordByNumber("buzz", 5, false));
	}
}
