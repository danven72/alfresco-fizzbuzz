package org.alfresco.alfrescofizzbuzz;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractNumberToWordProcessor implements NumberToWordProcessor {

	private List<WordByType>  wordByTypeList = new ArrayList<>();

	public AbstractNumberToWordProcessor(WordByType...wordByTypes ) {
		for (WordByType wbt: wordByTypes) {
			addWordByTypeProcessor(wbt);
		}
	}
	
	private void addWordByTypeProcessor(WordByType wordByType) {
		wordByTypeList.add(wordByType);
	}
	
    public String execute(List<Integer> numbers) {
    	
    	StringBuilder sb = new StringBuilder();    	    	    	
    	for (Integer num : numbers) {
    		String word = "";
    		for (WordByType wbn: wordByTypeList) {
   				WordByTypeResult wbtResult = wbn.myWord(num); 
    			word = word + wbtResult.getWordResult();
    			if (wbtResult.isWordFound() && wbtResult.isForceBreak()) {
   					break;
   				}
    		}
        	addNumberIfNoWord(sb, word, num);
    		
        	sb.append(" ");

    	}
        return sb.toString().trim();
    }
    
    private void addNumberIfNoWord(StringBuilder sb, String word, Integer num) {
    	if (word.length() > 0) {
   		 	sb.append(word);
    	}
    	else {
   		 sb.append(num);
    	}  	
    }
}
