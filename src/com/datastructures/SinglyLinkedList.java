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

    public boolean areEqual(ListNode head1, ListNode head2){
        return false;
    }

    public void deleteNode(int val){

    }

    public void deleteNodeWithoutKnowingHead(ListNode nodeToBeDeleted){

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
