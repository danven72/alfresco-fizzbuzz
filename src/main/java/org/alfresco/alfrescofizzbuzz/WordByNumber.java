package org.alfresco.alfrescofizzbuzz;

public class WordByNumber implements WordByType {
	
	private String myWord;
	private Integer myNumber;
	
	
	public WordByNumber(String myWord, Integer myNumber) {
		this.myWord = myWord;
		this.myNumber = myNumber;
	}

	public WordByTypeResult myWord(Integer  aNumber) {
		WordByTypeResult wbtR = new WordByTypeResult(false);
		String result = "";
		if (aNumber % getMyNumber() == 0) {
			result = getMyWord();
		}
		
		wbtR.setWordResult(result);
		return wbtR;
	}

	private String getMyWord() {
		return myWord;
	}

	private Integer getMyNumber() {
		return myNumber;
	}

}
