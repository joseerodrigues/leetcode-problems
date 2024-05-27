package com.cave.leetcode.longestCommonPrefix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void longestCommonPrefix_1() {
        String[] input = {"flower","flow","flight"};
        String expected = "fl";

        Solution solution = new Solution();
        assertEquals(expected, solution.longestCommonPrefix(input));
    }

    @Test
    void longestCommonPrefix_2() {
        String[] input = {"dog","racecar","car"};
        String expected = "";

        Solution solution = new Solution();
        assertEquals(expected, solution.longestCommonPrefix(input));
    }

    @Test
    void longestCommonPrefix_3() {
        String[] input = {"bala","balao","baliza"};
        String expected = "bal";

        Solution solution = new Solution();
        assertEquals(expected, solution.longestCommonPrefix(input));
    }

    @Test
    void longestCommonPrefix_4() {
        String[] input = {"","balao","baliza"};
        String expected = "";

        Solution solution = new Solution();
        assertEquals(expected, solution.longestCommonPrefix(input));
    }

    @Test
    void longestCommonPrefix_5() {
        String[] input = {"a"};
        String expected = "a";

        Solution solution = new Solution();
        assertEquals(expected, solution.longestCommonPrefix(input));
    }

    @Test
    void longestCommonPrefix_6() {
        String[] input = {"ab", "a"};
        String expected = "a";

        Solution solution = new Solution();
        assertEquals(expected, solution.longestCommonPrefix(input));
    }

    @Test
    void longestCommonPrefix_7() {
        String[] input = {"cir","car"};
        String expected = "c";

        Solution solution = new Solution();
        assertEquals(expected, solution.longestCommonPrefix(input));
    }
}