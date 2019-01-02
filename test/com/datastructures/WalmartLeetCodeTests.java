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


}