package org.alfresco.alfrescofizzbuzz.wordby;

public class WordByNumber extends AbstractWordByType /*implements WordByType*/ {
	
	private Integer myNumber;
		
	public WordByNumber(String myWord, Integer myNumber, boolean breakableResult) {
		super(myWord, breakableResult);
		this.myNumber = myNumber;
	}

	private Integer getMyNumber() {
		return myNumber;
	}

	@Override
	protected String applyLogic(Integer aNumber) {
		String result = "";
		if (aNumber % getMyNumber() == 0) {
			result = getMyWord();
		}
		return result;
	}

}
