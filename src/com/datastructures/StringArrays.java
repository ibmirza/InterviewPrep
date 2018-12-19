package com.datastructures;

public class StringArrays {

    //Arrays and Strings

    // Find if the given string has only unique characters
    public boolean isHavingUniqueChar(String input){
    	boolean[] array = new boolean[256]; 
    	boolean result = true;
    	for(int i=0; i<input.length(); i++){
    		if(array[input.charAt(i)] == false){
    			array[input.charAt(i)] = true;
    		}
    		else{
    			result = false;
    			break;
    		}
    	}
        return result;
    }

}
