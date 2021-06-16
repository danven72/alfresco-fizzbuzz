package org.alfresco.alfrescofizzbuzz;

public interface WordByType {

	public String myWord(Integer  aNumber);
	
	public default boolean isFoundWhenStringType() {
		return false;
	}
}
