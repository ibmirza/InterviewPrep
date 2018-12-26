package com.datastructures;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BuiltInLibTest {

    BuiltInLib bl;

    @Before
    public void setUp() throws Exception {
      bl = new BuiltInLib();
    }

    @Test
    public void testmatchingParenthesis(){
        String str1 = "(ab)";
        String str2 = "(a)b)";
        String str3 = "([])";
        String str4 = "([)]";
        String str5 = "((())";
        Assert.assertEquals(true, bl.isMatchValidateParenthesis(str1));
        Assert.assertEquals(false, bl.isMatchValidateParenthesis(str2));
        Assert.assertEquals(true, bl.isMatchValidateParenthesis(str3));
        Assert.assertEquals(false, bl.isMatchValidateParenthesis(str4));
        Assert.assertEquals(false, bl.isMatchValidateParenthesis(str5));

    }


}