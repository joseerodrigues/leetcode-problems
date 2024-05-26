package com.cave.leetcode.findMedianSortedArrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void findMedianSortedArrays_1() {
        int[] nums1 = { 1, 3 };
        int[] nums2 = { 2 };
        double expected = 2;

        Solution solution = new Solution();
        assertEquals(expected, solution.findMedianSortedArrays(nums1, nums2));
    }

    @Test
    void findMedianSortedArrays_2() {
        int[] nums1 = { 1, 2 };
        int[] nums2 = { 3, 4 };
        double expected = 2.5;

        Solution solution = new Solution();
        assertEquals(expected, solution.findMedianSortedArrays(nums1, nums2));
    }
}