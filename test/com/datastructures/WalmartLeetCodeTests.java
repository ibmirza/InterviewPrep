package com.datastructures;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WalmartLeetCodeTests {

    WalmartLeetCode wmt;

    @Before
    public void setUp() throws Exception {
      wmt = new WalmartLeetCode();
    }

    @Test
    public void testMoveZeroesToEnd(){
        Assert.assertArrayEquals(new int[]{1,3,12,0,0}, wmt.moveAllZeroesToEnd(new int[]{0,1,0,3,12}));
    }

    @Test
    public void testTwoSum(){
        Assert.assertArrayEquals(new int[]{0,1}, wmt.twoSum(new int[]{2,7,11,15}, 9));
    }

    @Test
    public void removeDuplicates(){
        int result = wmt.removeDuplicates(new int[]{2,7,7,8,9,10,10,11});
        Assert.assertEquals(6, result);
    }

    @Test
    public void testRob(){
        int result = wmt.maxRob(new int[]{2,7,9,3,1});
        Assert.assertEquals(12, result);
    }

    @Test
    public void testValidateParenthesis(){
        Assert.assertFalse(wmt.isValidParenthesis("([)]"));
        Assert.assertTrue(wmt.isValidParenthesis("()[]{}"));
    }


}