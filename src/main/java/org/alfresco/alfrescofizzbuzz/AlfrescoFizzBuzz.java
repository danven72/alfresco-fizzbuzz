package org.alfresco.alfrescofizzbuzz;

public class AlfrescoFizzBuzz extends AbstractNumberToWordProcessor {

	public AlfrescoFizzBuzz() {
		
		super(new WordByString("alfresco", "3"), new WordByNumber("fizz", 3), new WordByNumber("buzz", 5));
	}
}
