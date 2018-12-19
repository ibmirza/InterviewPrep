package com.datastructures;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringArraysTest {

    StringArrays strArray;

    @Before
    public void setUp() throws Exception {
      strArray = new StringArrays();
    }

    @Test
    public void testIsHavingUniqueChar(){
        Assert.assertTrue(strArray.isHavingUniqueChar("abcd"));
        Assert.assertFalse(strArray.isHavingUniqueChar("abtabkj"));
    }


}