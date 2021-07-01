package org.alfresco.alfrescofizzbuzz.wordby;

public class WordByString extends AbstractWordByType {
	
	private String myString;

	public WordByString(String myWord, String myString, boolean breakableResult) {
		super(myWord, breakableResult);
		this.myString = myString;
	}

	private String getMyString() {
		return myString;
	}

	@Override
	protected String applyLogic(Integer aNumber) {
		String result = "";
		String numberStr = String.valueOf(aNumber);
		if (numberStr.contains(getMyString())) {
			result = getMyWord();
		}

		return result;
	}
}
