package com.example;

public class add_two_numbers_2 {



    public static class ListNode {
       int val;
        ListNode next;
        ListNode(int x) { val = x; }
   }
   public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode newHead = new ListNode(0);
        ListNode currentNode = newHead;
        ListNode p1 = null,p2 = null,p3= null;
        p1=l1;
        p2=l2;
        int sum;
        int carry = 0;
        while(p1!=null || p2!=null)
        {
            //addList(newhead, currentNode, p1.val+p2.val +sum);
            int x =(p1!=null)? p1.val:0;
            int y =(p2!=null)? p2.val:0;
            sum = x + y + carry;
            carry = sum / 10;
            currentNode.next = new ListNode (sum % 10);
            currentNode = currentNode.next;
            if(p1!=null) p1 = p1.next;
            if(p2!=null) p2 = p2.next;
        }
        if(carry >0)
        {
            currentNode.next = new ListNode(carry);
        }
        return newHead.next;
    }

}

