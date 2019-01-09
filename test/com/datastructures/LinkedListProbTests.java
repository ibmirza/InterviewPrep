package com.datastructures;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LinkedListProbTests {
    SinglyLinkedList ls;

    @Before
    public void setUp() throws Exception {
         ls = new SinglyLinkedList();
    }

    @Test
    public void testListsAreEqual(){
        SinglyLinkedList list1 = new SinglyLinkedList();
        list1.addToLast(new ListNode(1));
        list1.addToLast(new ListNode(2));
        list1.addToLast(new ListNode(3));

        SinglyLinkedList list2 = new SinglyLinkedList();
        list2.addToLast(new ListNode(1));
        list2.addToLast(new ListNode(2));
        list2.addToLast(new ListNode(3));
        list2.addToLast(new ListNode(4));

        Assert.assertFalse(ls.areEqual(list1.head, list2.head));
    }

}