package com.cave.leetcode.longestCommonPrefix;

public class Solution {

    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 1) {
            return strs[0];
        }

        int charPos = 0;
        String firstStr = strs[0];
        for (int i = 0; i < firstStr.length(); i++) {
            char c = firstStr.charAt(i);
            boolean equal = true;
            for (int j = 1; j < strs.length; j++) {
                String str = strs[j];
                if (i >= str.length() || str.charAt(i) != c) {
                    equal = false;
                    break;
                }
            }
            if (equal) {
                charPos = i + 1;
            }else {
                break;
            }
        }

        return charPos == 0 ? "" : firstStr.substring(0, charPos);
    }
}
