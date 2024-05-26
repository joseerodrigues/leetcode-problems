package com.cave.leetcode.reverseinteger;

public class Solution {
    public int reverse(int x) {
        int ret = 0;
        int num = Math.abs(x);

        while (num != 0) {
            int remainder = num % 10;

            if (ret > (Integer.MAX_VALUE - remainder) / 10) {
                return 0;
            }

            num = num / 10;
            ret = ret * 10 + remainder;
        }

        return (x < 0) ? -ret:ret;
    }
}
