package com.cave.leetcode.lengthOfLongestSubstring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void lengthOfLongestSubstring_1() {
        Solution solution = new Solution();
        String input = "abcabcbb";
        int expected = 3;

        assertEquals(expected, solution.lengthOfLongestSubstring(input));
    }

    @Test
    void lengthOfLongestSubstring_2() {
        Solution solution = new Solution();
        String input = "bbbbb";
        int expected = 1;

        assertEquals(expected, solution.lengthOfLongestSubstring(input));
    }

    @Test
    void lengthOfLongestSubstring_3() {
        Solution solution = new Solution();
        String input = "pwwkew";
        int expected = 3;

        assertEquals(expected, solution.lengthOfLongestSubstring(input));
    }

    @Test
    void lengthOfLongestSubstring_4() {
        Solution solution = new Solution();
        String input = " ";
        int expected = 1;

        assertEquals(expected, solution.lengthOfLongestSubstring(input));
    }

    @Test
    void lengthOfLongestSubstring_5() {
        Solution solution = new Solution();
        String input = "";
        int expected = 0;

        assertEquals(expected, solution.lengthOfLongestSubstring(input));
    }

    @Test
    void lengthOfLongestSubstring_6() {
        Solution solution = new Solution();
        String input = "au";
        int expected = 2;

        assertEquals(expected, solution.lengthOfLongestSubstring(input));
    }

    @Test
    void lengthOfLongestSubstring_7() {
        Solution solution = new Solution();
        String input = "aab";
        int expected = 2;

        assertEquals(expected, solution.lengthOfLongestSubstring(input));
    }

    @Test
    void lengthOfLongestSubstring_8() {
        Solution solution = new Solution();
        String input = "dvdf";
        int expected = 3;

        assertEquals(expected, solution.lengthOfLongestSubstring(input));
    }
}