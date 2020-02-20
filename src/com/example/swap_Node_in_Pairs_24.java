package com.example;

import java.util.List;

public class swap_Node_in_Pairs_24 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }
    public ListNode swapPairs(ListNode head){
        //corner case
        if(head == null|| head.next==null) return head;
        ListNode fakehead = new ListNode(0);
        fakehead.next =head;
        ListNode ptr1 = fakehead;
        ListNode ptr2 = head;
        while( ptr2!=null&&ptr2.next!=null)
        {
            ListNode newstart = ptr2.next.next;
            ptr2.next.next = ptr2;
            //if ptr2.next = newstart; then  ptr1.next =ptr2.next;, ptr2 already change
            ptr1.next =ptr2.next;
            ptr2.next = newstart;
            ptr1 = ptr2;
            ptr2 = ptr2.next;

        }
        return fakehead.next;
    }
    //method2: time exceed
    /*
    public ListNode swapPairs(ListNode head) {
        //corner case
        if(head == null|| head.next==null) return head;

        //save the newHead, then switch
        ListNode newHead = head.next;
        ListNode currentNode = head;
        ListNode nextNode = head.next;
        ListNode tempNode = null;

        while(nextNode!=null)
        {

            currentNode.next = nextNode.next;
            nextNode.next = currentNode;
            tempNode = currentNode;
            currentNode = nextNode;
            nextNode = currentNode;

            //move the ptr
            currentNode = currentNode.next.next;
            nextNode = nextNode.next.next;
        }
        return newHead;
    }

     */
}
