package com.datastructures;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RecursionTest {

    BasicRecursion bs;
    @Before
    public void setUp() throws Exception {
      bs = new BasicRecursion();
    }

    @Test
    public void test1toN() {
        bs.print1ToN(5);
    }

    @Test
    public void testNto1(){
        bs.printNto1(5);
    }

    @Test
    public void testSumOfArrayElements(){
        int[] array = {};
        Assert.assertEquals(0, bs.sumOfElementsOfArray(array));
    }

    @Test
    public void testSumOfDigits(){
        Assert.assertEquals(3, bs.getSumOfDigits(111));
    }

    @Test
    public void testArrayPalindromic(){
        int[] array = {1,2,2,1};
        Assert.assertEquals(true, bs.isArrayPalindromic(array));
    }

    @Test
    public void testIndexOfElementInArray(){
        int[] array = {1,2,3,4,5};
        Assert.assertEquals(2, bs.getIndexOfElementInArray(array, 3));
    }

    @Test
    public void testFactorial(){
        Assert.assertEquals(120, bs.factorial(5));
    }

    @Test
    public void testTotalFingers(){
        Assert.assertEquals(52,bs.totalFingers(5));
    }


}