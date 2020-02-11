package com.example;
//参考链接： https://www.cnblogs.com/lightwindy/p/8503688.html
public class merge_two_sorted_lists_21 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if(l1==null) return l2;
        if(l2==null) return l1;
        //只需要返回newHead.next 即可
        ListNode newHead = new ListNode(0);
        ListNode curNode = newHead;

        while (l1 != null && l2!=null)
        {
            //不需要了l1,l2一起往下移动，因为放进去当前的可能比
            //下一轮还要大
            if(l1.val<l2.val)
            {
                curNode.next = l1;
                l1 = l1.next;
            }
            else {

                curNode.next = l2;
                l2= l2.next;
            }
            curNode = curNode.next;
        }
        //假如其中一个null了，无需再while，直接把剩余的接上去；
        if(l1==null)
            curNode.next =l2;
        if(l2==null)
            curNode.next = l1;
        return newHead.next;
    }
}
