package org.alfresco.alfrescofizzbuzz;

public class WordByString  implements WordByType {
	
	private String myWord;
	private String myString;

	public WordByString(String myWord, String myString) {
		super();
		this.myWord = myWord;
		this.myString = myString;
	}

	@Override
	public WordByTypeResult myWord(Integer aNumber) {
		WordByTypeResult wbtR = new WordByTypeResult(true);
		String result = "";
		String numberStr = String.valueOf(aNumber);
		if (numberStr.contains(getMyString())) {
			result = getMyWord();
		}
		wbtR.setWordResult(result);
		return wbtR;
	}
	
	private String getMyString() {
		return myString;
	}

	private final String getMyWord() {
		return myWord;
	}


}
