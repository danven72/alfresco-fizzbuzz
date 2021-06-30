package org.alfresco.alfrescofizzbuzz;

public class WordByTypeResult {
	
	private String wordResult = "";
	private boolean forceBreakWhenFound = false;
	
	public WordByTypeResult(boolean forceBreakWhenFound) {
		this.forceBreakWhenFound = forceBreakWhenFound;
	}
	
	public boolean isWordFound() {
		return wordResult.length() > 0;
	}

	public boolean isForceBreak() {
		return forceBreakWhenFound;
	}
	
	public String getWordResult() {
		return wordResult;
	}
	
	public void setWordResult(String wordResult) {
		this.wordResult = wordResult;
	}
}
