package com.cave.leetcode.reverseinteger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void reverse_1() {
        Solution solution = new Solution();
        int input = 123;
        int expected = 321;

        assertEquals(expected, solution.reverse(input));
    }

    @Test
    void reverse_2() {
        Solution solution = new Solution();
        int input = -123;
        int expected = -321;

        assertEquals(expected, solution.reverse(input));
    }

    @Test
    void reverse_3() {
        Solution solution = new Solution();
        int input = 120;
        int expected = 21;

        assertEquals(expected, solution.reverse(input));
    }

    @Test
    void reverse_4() {
        Solution solution = new Solution();
        int input = 1534236469;
        int expected = 0;

        assertEquals(expected, solution.reverse(input));
    }
}