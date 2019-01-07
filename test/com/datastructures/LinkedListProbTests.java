package com.datastructures;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LinkedListProbTests {
    LinkedList ls;

    @Before
    public void setUp() throws Exception {
         ls = new LinkedList();
    }

    @Test
    public void testListsAreEqual(){

        LinkedList list1 = new LinkedList();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        LinkedList list2 = new LinkedList();
        list2.add(1);
        list2.add(2);
        list2.add(4);
        list2.add(5);

        Assert.assertTrue(ls.areEqual(list1.head, list2.head));
    }

    @Test
    public void isOdd(){

    }


}