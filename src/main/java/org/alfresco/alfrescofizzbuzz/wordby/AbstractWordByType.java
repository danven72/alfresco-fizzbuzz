package org.alfresco.alfrescofizzbuzz.wordby;

import org.alfresco.alfrescofizzbuzz.model.WordByTypeResult;

public abstract class AbstractWordByType implements WordByType {
	
	private String myWord;	
	private boolean breakableResult;
	
	public AbstractWordByType(String myWord, boolean breakableResult) {
		this.myWord = myWord;
		this.breakableResult = breakableResult;
	}
	
	public WordByTypeResult myWord(Integer  aNumber) {
		WordByTypeResult wbtR = new WordByTypeResult(breakableResult);
		wbtR.setWordResult(applyLogic(aNumber));

		return wbtR;
	}
	
	protected abstract String applyLogic(Integer type);

	protected String getMyWord() {
		return myWord;
	}
}
