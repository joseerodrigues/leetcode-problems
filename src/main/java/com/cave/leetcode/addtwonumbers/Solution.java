package com.cave.leetcode.addtwonumbers;

//https://leetcode.com/problems/add-two-numbers/

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode node = null;
        ListNode head = null;
        int carry = 0;

        while (l1 != null) {
            while (l2 != null) {
                int sum = 0;

                if (l1 != null) {
                    sum += l1.val;
                    l1 = l1.next;
                }
                sum += l2.val + carry;
                carry = 0;

                if (sum > 9) {
                    carry = sum / 10;
                    sum = sum % 10;
                }

                if (head == null) {
                    head = new ListNode(sum);
                    node = head;
                } else {
                    node.next = new ListNode(sum);
                    node = node.next;
                }

                l2 = l2.next;

                if (l2 == null && carry > 0) {
                    node.next = new ListNode(carry);
                }
            }

            if (l1 != null) {
                node.next = new ListNode(0);
                node = node.next;
                l1 = l1.next;

                if (l1 == null && carry > 0) {
                    node.next = new ListNode(carry);
                }
            }
        }

        return head;
    }
}
