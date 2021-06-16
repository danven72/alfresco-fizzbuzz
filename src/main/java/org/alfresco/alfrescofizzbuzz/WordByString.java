package org.alfresco.alfrescofizzbuzz;

public class WordByString  implements WordByType {
	
	private String myWord;
	private String myString;
	private boolean foundWhenString = false;

	public WordByString(String myWord, String myString) {
		super();
		this.myWord = myWord;
		this.myString = myString;
	}

	@Override
	public String myWord(Integer aNumber) {
		foundWhenString = false;
		String result = "";
		String numberStr = String.valueOf(aNumber);
		if (numberStr.contains(getMyString())) {
			result = getMyWord();
			foundWhenString = true;
		}			
		return result;
	}
	
	@Override
	public boolean isFoundWhenStringType() {
		return foundWhenString;
	}

	private String getMyString() {
		return myString;
	}

	private final String getMyWord() {
		return myWord;
	}


}
