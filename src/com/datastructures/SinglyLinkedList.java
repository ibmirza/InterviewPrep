package com.datastructures;

public class SinglyLinkedList {

    ListNode head;

    SinglyLinkedList(){
        head = null;
    }

    public void addToFront(ListNode node){
        if(head == null)
            head = node;
        else{
            ListNode temp = head;
            head = node;
            head.next = temp;
        }
    }

    public void addToLast(ListNode node){
        if(head == null)
            head = node;
        else{
            ListNode curr = head;
            ListNode prev = null;
            while(curr!=null){
                prev = curr;
                curr = curr.next;
            }
            prev.next = node;
        }
    }

    public boolean isContains(ListNode head, int val){
        ListNode curr = head;
        while(curr!=null){
            if(curr.data == val)
                return true;
            else
                curr = curr.next;
        }
        return false;
    }

    public boolean areEqual(ListNode head1, ListNode head2){
        return false;
    }

    public void deleteNode(ListNode head, int val){
        ListNode prev=null;
        ListNode curr=head;
        if(head.data == val){
           head = curr.next;
           curr = null;
        }
        while(curr != null) {
            if (curr.data == val) {
                prev.next = curr.next;
                curr = null;
            } else {
                prev = curr;
                curr = curr.next;
            }
        }
    }

    // Delete node without knowing its head.
    // constraint: this node will not be the last node
    public void deleteNodeWithoutKnowingHead(ListNode nodeToBeDeleted){
        ListNode curr = nodeToBeDeleted;
        ListNode next = curr.next;
        curr.data = next.data;
        curr.next = next.next;
        next = null;
    }

    public ListNode findMiddleNodeInOnePass(ListNode head){
        return null;
    }

    public ListNode findNthNodeFromLast(int nodeFromLast){
        return null;
    }

    public boolean hasCycle(ListNode head){
        return false;
    }

    public ListNode removeCycle(ListNode head){
        return null;
    }

    public boolean isListPalindromic(ListNode head){
        return false;
    }

    public ListNode reverseListIterative(ListNode head){
        return null;
    }

    public ListNode reverseListRecursive(ListNode head){
        return null;
    }

    public ListNode mergeTwoSortedListsInPlace(ListNode head1, ListNode head2){
        return null;
    }

    public ListNode alternateMergeTwoLists(ListNode head1, ListNode head2){
        return null;
    }

    public ListNode cloneOfDoublyTroublyLinkedList(ListNode head1){
        return null;
    }

}
