package com.cave.leetcode.addtwonumbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    ListNode buildList(int ... values) {
        ListNode node = null;
        ListNode head = null;

        for (int i : values){
            if (node==null){
                node = new ListNode(i);
                head = node;
            }else{
                node.next = new ListNode(i);
                node = node.next;
            }
        }

        return head;
    }

    @Test
    void addTwoNumbers_1() {
        ListNode l1 = buildList(2, 4, 3);
        ListNode l2 = buildList(5, 6, 4);
        ListNode expected = buildList(7, 0, 8);

        Solution solution = new Solution();
        assertEquals(expected, solution.addTwoNumbers(l1, l2));
    }

    @Test
    void addTwoNumbers_2() {
        ListNode l1 = buildList(0);
        ListNode l2 = buildList(0);
        ListNode expected = buildList(0);

        Solution solution = new Solution();
        assertEquals(expected, solution.addTwoNumbers(l1, l2));
    }

    @Test
    void addTwoNumbers_3() {
        ListNode l1 = buildList(9,9,9,9,9,9,9);
        ListNode l2 = buildList(9,9,9,9);
        ListNode expected = buildList(8,9,9,9,0,0,0,1);

        Solution solution = new Solution();
        assertEquals(expected, solution.addTwoNumbers(l1, l2));
    }

    @Test
    void addTwoNumbers_4() {
        ListNode l1 = buildList(2,4,9);
        ListNode l2 = buildList(5,6,4,9);
        ListNode expected = buildList(7,0,4,0,1);

        Solution solution = new Solution();
        assertEquals(expected, solution.addTwoNumbers(l1, l2));
    }

    @Test
    void addTwoNumbers_5() {
        ListNode l1 = buildList(9,9,1);
        ListNode l2 = buildList(1);
        ListNode expected = buildList(0,0,2);

        Solution solution = new Solution();
        assertEquals(expected, solution.addTwoNumbers(l1, l2));
    }

    @Test
    void addTwoNumbers_6() {
        ListNode l1 = buildList(9);
        ListNode l2 = buildList(9);
        ListNode expected = buildList(8,1);

        Solution solution = new Solution();
        assertEquals(expected, solution.addTwoNumbers(l1, l2));
    }
}