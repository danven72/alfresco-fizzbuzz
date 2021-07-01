package org.alfresco.alfrescofizzbuzz.processor;

import java.util.ArrayList;
import java.util.List;

import org.alfresco.alfrescofizzbuzz.model.WordByTypeResult;
import org.alfresco.alfrescofizzbuzz.wordby.WordByType;

public abstract class AbstractNumberToWordProcessor implements NumberToWordProcessor {

	private List<WordByType>  wordByTypeList = new ArrayList<>();

	public AbstractNumberToWordProcessor(WordByType...wordByTypes ) {
		for (WordByType wbt: wordByTypes) {
			wordByTypeList.add(wbt);
		}
	}
	
    public String execute(List<Integer> numbers) {
    	
    	StringBuilder sb = new StringBuilder();    	    	    	
    	for (Integer num : numbers) {
    		String word = "";
    		for (WordByType wbt: wordByTypeList) {
   				WordByTypeResult wbtResult = wbt.myWord(num); 
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
