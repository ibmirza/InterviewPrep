package com.datastructures;

public class StringArrays {

    //Arrays
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

    public void printAllSubsets(int[] array){

    }

    //Given a sorted array, return i index such that a[i]==i  [-5,-3,0,2,4,6,9] in 'log n' time
    public void findIndexMatchingValue(int[] array, int i){

    }

    // Find an element 'k' in a sorted rotated array in 'log n' time
    public void findElementInSortedRotatedArray(int[] array, int k){

    }

    // Find first index of element in sorted array with duplicates.  in 'log n' time
    public int getFirstOccurence(int[] array, int k){
        return 1;
    }

    //Find last index of element in sorted array with duplicates.  in 'log n' time
    public int getLastOccurence(int[] array, int k){
        return 1;
    }

    //Find frequency of element 'k' in sorted array.  in 'log n' time
    public void findFrequency(int[] array, int k){

    }

    // Find square root of number.  in 'log n' time
    public void squareRoot(int i){

    }

    //Given an unsorted array of positive numbers. All zeroes moved to front. Count number of zeroes.
    public void zeroCount(int[] array){

    }

    //Find the peak element in array -   log n based approach
    // peak element is greater than its neighbors
    public void peakElement(int[] array){

    }

    // Find the median of two sorted arrays without merging them log(m+n)
    public void medianOfTwoSortedArrays(int[] a, int[] b){

    }


    // Given a sorted array with missing elements in it. Find the missing element in log n time
    public void findMissingElement(int[] array){

    }

    //Given a sorted array, find the index at which the the value of 'k' should be inserted
    public void findIndexToInsert(int[] array, int k){

    }

}
