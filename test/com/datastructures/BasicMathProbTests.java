package com.datastructures;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BasicMathProbTests {

    BasicMathProblems bs;

    @Before
    public void setUp() throws Exception {
      bs = new BasicMathProblems();
    }

    @Test
    public void isEven(){
        Assert.assertTrue(bs.isEven(0));
    }

    @Test
    public void isOdd(){
        Assert.assertTrue(bs.isOdd(0));
    }


}