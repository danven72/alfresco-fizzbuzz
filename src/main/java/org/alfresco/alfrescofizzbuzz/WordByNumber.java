package org.alfresco.alfrescofizzbuzz;

public class WordByNumber implements WordByType {
	
	private String myWord;
	private Integer myNumber;
	
	
	public WordByNumber(String myWord, Integer myNumber) {
		this.myWord = myWord;
		this.myNumber = myNumber;
	}

	public String myWord(Integer  aNumber) {
		String result = "";
		if (aNumber % getMyNumber() == 0) {
			result = getMyWord();
		}
		return result;
	}

	private String getMyWord() {
		return myWord;
	}

	private Integer getMyNumber() {
		return myNumber;
	}

}
