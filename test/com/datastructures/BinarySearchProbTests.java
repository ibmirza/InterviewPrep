package com.datastructures;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

public class BinarySearchProbTests {

    BinarySearchProb bs;

    @Before
    public void setUp() throws Exception {
      bs = new BinarySearchProb();
    }

    @Test
    public void testBinarySearchIterative(){
        int[] array = {2,7};
        Assert.assertEquals(-1, bs.findIndexOfElementIterative(array, 7));
    }

    @Test
    public void testBinarySearchRecursive(){
        int[] array = {1,2,3};
        Assert.assertEquals(-1, bs.findIndexOfElementRecursive(array, 0));
    }

    @Test
    public void testFirstOccurenceOfElement(){
        int[] array = {1,3,4,6,6,6,8,10,10,15,30};
        Assert.assertEquals(7, bs.findFirstOccurence(array, 15));
        Assert.assertEquals(3, bs.findFirstOccurence(array, 6));
        Assert.assertEquals(-1, bs.findFirstOccurence(array, 11));
    }

    @Test
    public void testLastOccurenceOfElement(){
        int[] array = {1,3,4,6,6,6,8,10,10,15,30};
        Assert.assertEquals(8, bs.findLastOccurence(array, 10));
        Assert.assertEquals(5, bs.findLastOccurence(array, 6));
        Assert.assertEquals(-1, bs.findLastOccurence(array, 11));
        Assert.assertEquals(10, bs.findLastOccurence(array, 30));

    }

    @Test
    public void testFrequencyOfElement(){
        int[] array = {1,3,4,6,6,6,8,10,10,15,30};
        Assert.assertEquals(2, bs.findFrequency(array, 10));
        Assert.assertEquals(3, bs.findFrequency(array, 6));
        Assert.assertEquals(9, bs.findFrequency(array, 15));
        Assert.assertEquals(0, bs.findFrequency(array, 11));
    }

    @Test
    public void testIndexWhichHasSameValue(){
        int[] array = {-1,0,2,2,4,5};
        int[] arr = {-1,0,1,2,3,4};
        Assert.assertEquals(2, bs.findIndexMatchingValue(array));
        Assert.assertEquals(-1, bs.findIndexMatchingValue(arr));
    }

    @Test
    public void testSquareRoot(){
       Assert.assertEquals(5.0, bs.findSquareRoot(25), 0);
       Assert.assertEquals(2.236,bs.findSquareRoot(5), 0);
       // double s = bs.findSquareRoot(5);
       // System.out.println(s);
    }

    @Test
    public void testZeroCountUnsortedArray(){
        int[] array = {0,0,0,0,3,2,2,7,6};
        Assert.assertEquals(4,bs.zeroCount(array));
    }

    @Test
    public void testPeakElement(){
        int[] array = {0,2,3,4,9,7,2};
        int[] array2 = {16,17,18,2,4,9,6,12,8};
        int[] array3 = {0,1,2,3};
        Assert.assertEquals(4,bs.findPeakElement(array));
        Assert.assertEquals(7,bs.findPeakElement(array2));
        Assert.assertEquals(3,bs.findPeakElement(array3));

    }

    @Test
    public void testMissingElement(){
        int[] array = {1,2,3,4,5,7,8,9};
        int[] array3 = {1,3,4,5,6,7};
        Assert.assertEquals(2,bs.findMissingElement(array3));
        Assert.assertEquals(6, bs.findMissingElement(array));
    }

    @Test
    public void testInsertLocation(){
        int[] array = {1,3,4,5,6,7};
        int[] array2 = {1,2,3,4,5,7};
        int[] array3 = {1,2,3,5,6,7};
        Assert.assertEquals(1,bs.findIndexToInsert(array, 2));
        Assert.assertEquals(5,bs.findIndexToInsert(array2, 6));
        Assert.assertEquals(3,bs.findIndexToInsert(array3, 4));
    }

    @Test
    public void testRotatedSortedArray(){
        int[] array = {3,4,5,1,2};
        Assert.assertEquals(1,bs.findElementInSortedRotatedArray(array, 4));
    }
}