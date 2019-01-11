package com.datastructures;

public class BinarySearchProb {

    //find the index of an element 'k' in an array - iterative
    public int findIndexOfElementIterative(int[] array, int k){
    	int low = 0;
    	int arrayLength = array.length;
    	int high = arrayLength - 1;
    	while(low <= high){
    		int mid = low + (high-low)/2;
    		if(array[mid] == k)
    			return mid;
    		else if(array[mid] > k)
    			high = mid-1;
    		else 
    			low = mid+1;
    	}
        return -1;
   }

   //find the index of element 'k' in an array - recursive
   public int findIndexOfElementRecursive(int[] array, int k){
   	    int low = 0;
    	int arrayLength = array.length;
    	int high = arrayLength - 1;
        return binarySearch(array, 0, high, k);
   }

   private int binarySearch(int[] array, int low, int high, int k){
    	if(low<=high){
    		int mid = low + (high - low)/2;
    		if(array[mid] == k)
    			return mid;
    		else if(array[mid]<k)
    			return binarySearch(array, mid+1, high, k);
    		else
    			return binarySearch(array, low, mid-1, k);
    	}
    	return -1;
   }

    // Print all the subsets of a given integer array
    public void printAllSubsets(int[] array){

    }

    //Given a sorted array, return i index such that a[i]==i  [-5,-3,0,2,4,6,9] in 'log n' time
    public int findIndexMatchingValue(int[] array){
        //int p = -1;
        int low = 0;
    	int high = array.length - 1;
    	while(low <= high){
    		int mid = low + (high-low)/2;
    		if(array[mid] == mid){
    			return mid;
    		}
    		else if(array[mid] > mid)
    			high = mid-1;
    		else 
    			low = mid+1;
    	}
        return -1;
    }

    // Find an element 'k' in a sorted rotated array in 'log n' time [3,4,5,1,2]
    public int findElementInSortedRotatedArray(int[] array, int k){
        int low = 0;
        int high = array.length-1;
        while(low<=high){
           int mid = low + (high-low)/2;
           if(array[mid] == k)
                return mid;
           else if(k < array[mid] && array[low] < k)
                high = mid-1;
           else
                low = mid+1;
        }
        return -1;
    }

    // Find first index/occurence of element 'k' in sorted array with duplicates.  in 'log n' time [1,2,3,4,4,4,5]
    public int findFirstOccurence(int[] array, int k){
        int p = -1;
        int low = 0;
    	int high = array.length - 1;
    	while(low <= high){
    		int mid = low + (high-low)/2;
    		if(array[mid] == k){
    			p = mid;
                high = mid-1;
    		}
    		else if(array[mid] > k)
    			high = mid-1;
    		else
    			low = mid+1;
    	}
        return p;
    }

    //Find last index of element in sorted array with duplicates.  in 'log n' time
    public int findLastOccurence(int[] array, int k){
        int low = 0;
        int p = -1;
    	int high = array.length - 1;
    	while(low <= high){
    		int mid = low + (high-low)/2;
    		if(array[mid] == k){
    			p = mid;
                low = mid+1;
    		}
    		else if(array[mid] > k)
    			high = mid-1;
    		else
    			low = mid+1;
    	}
        return p;
    }

    //Find frequency of element 'k' in sorted array.  in 'log n' time [1,2,3,4,4,5]
    public int findFrequency(int[] array, int k){
        int last = findLastOccurence(array, k);
        int first = findFirstOccurence(array, k);
        int result = last - first;
        if(last==-1 && first==-1)
            return 0;
        else if(first==last && result>=0)
            return  first;
        else
            return result+1;
    }

    // Find square root of number.  in 'log n' time
    public double findSquareRoot(double n){
    	double low = 0;
    	double high = n;
    	while(low <= high){
    		double mid = (low + high)/2.0;
    		if(Math.round( (mid*mid) * 1000.0 ) / 1000.0 == n){
    			return Math.round( mid * 1000.0 ) / 1000.0;
    		}
    		else if(mid*mid > n)
    			high = mid;
    		else 
    			low = mid;
    	}
        return 0.0;
    }

    //Given an unsorted array of positive numbers. All zeroes moved to front. Count number of zeroes/last.
	// Ex: [0,0,0,0,3,2,2,7,6]
    public int zeroCount(int[] array){
        int low = 0;
    	int arrayLength = array.length;
    	int high = arrayLength - 1;
    	while(low <= high){
    		int mid = low + (high-low)/2;
    		if(array[mid] == 0 && array[mid+1]>0){
    			return mid+1;
    		}
    		else if(array[mid] > 0)
    			high = mid-1;
    		else
    			low = mid+1;
    	}
        return -1;
    }

    //Find the peak element in array -   log n based approach
    // peak element is greater than its neighbors
    public int findPeakElement(int[] array){
		int low = 0;
		int arrayLength = array.length;
		int high = arrayLength - 1;
		while(low < high){
			int mid = low + (high-low)/2;
			if (array[mid] > array[mid + 1] && array[mid] > array[mid - 1]) {
				return mid;
			}
			else if(mid==0 && array[mid]> array[mid+1]) {
				return mid;
			}
			else if(mid==high && array[mid]>array[mid-1]) {
				return mid;
			}
			else if (array[mid + 1] > array[mid])
				    low = mid + 1;
				 else
					high = mid - 1;
		}
		return low;
    }

    // Find the median of two sorted arrays without merging them with TC: log(m+n) SC: O(1)
	// [1,3,5,7]
	// [2,4,8]
    public void medianOfTwoSortedArrays(int[] a, int[] b){
    	int lowOfA = 0;
    	int highOfA = a.length-1;

		int lowOfB = 0;
		int highOfB = b.length-1;

		while(lowOfA<highOfA && lowOfB<highOfB){
			int midOfA = lowOfA + (highOfA-lowOfA)/2;
			int midOfB = lowOfB + (highOfB-lowOfB)/2;

			if(a[midOfA] < b[midOfB]){
				lowOfA = midOfA;
				highOfB = midOfB;
			}
			else{

			}
		}
    }


    // Given a sorted array with distinct elements in it. Find missing element in it. Find the missing element in log n time
	// [1,2,3,4,5,7]
	//  0,1,2,3,4,5
	// constraint elements are 1 to N i.e if array size is 5 then elements are 0 to 5
    public int findMissingElement(int[] array){
		int low = 0;
		int high = array.length - 1;
		while(low < high){
			int mid = low + (high-low)/2;
			if (array[mid] != mid+1) {
				high = mid;
			}
			else
				low = mid + 1;
		}
		return array[low]-1;
    }

    //Given a sorted array, find the index at which the the value of 'k' should be inserted [1,2,3,4,6,7]
    public int findIndexToInsert(int[] array, int k){
		int low = 0;
		int high = array.length - 1;
		while(low < high){
			int mid = low + (high-low)/2;
			if ( k > array[mid]) {
				low = mid+1;
			}
			else
				high = mid-1;
		}
		return low;
    }
}