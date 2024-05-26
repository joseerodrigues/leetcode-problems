package com.cave.leetcode.addtwonumbers;

//https://leetcode.com/problems/add-two-numbers/

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node = null;
        ListNode head = null;
        int carry = 0;
        do {
            int l1v = 0;
            int l2v = 0;

            if (l1 != null) {
                l1v = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                l2v = l2.val;
                l2 = l2.next;
            }

            int sum = l1v + l2v + carry;
            carry = sum / 10;
            int digit = sum % 10;

            if (head == null) {
                head = new ListNode(digit);
                node = head;
            }else{
                node.next = new ListNode(digit);
                node = node.next;
            }
            if (digit == 0 && carry > 0){
                node.next = new ListNode(carry);
            }
            //System.out.println(digit);
        }while (l1 != null || l2 != null);

        return head;
    }
}
