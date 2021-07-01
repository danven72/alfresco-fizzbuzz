package org.alfresco.alfrescofizzbuzz;

import org.alfresco.alfrescofizzbuzz.processor.AbstractNumberToWordProcessor;
import org.alfresco.alfrescofizzbuzz.wordby.WordByNumber;

public class FizzBuzz  extends AbstractNumberToWordProcessor  {
	
	public FizzBuzz() {
		super(new WordByNumber("fizz", 3, false), new WordByNumber("buzz", 5, false));
	}	

}
