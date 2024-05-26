package com.cave.leetcode.findMedianSortedArrays;

import java.util.Arrays;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] all = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, all, 0, nums1.length);
        System.arraycopy(nums2, 0, all, nums1.length, nums2.length);
        Arrays.sort(all);
        int size = all.length;

        if (size % 2 == 0) {
            return (all[size / 2 - 1] + all[size / 2]) / 2.0;
        }else{
            return all[size / 2];
        }
    }
}
