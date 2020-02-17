package com.seeyouweb.leetcode.algorithm.solution;

import org.junit.Test;

/**
 * 回文数
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 *
 * @author Zeke_Red
 * @version 1.0.0
 */
public class Solution9 {

    public boolean isPalindrome(int x) {
        StringBuilder sb = new StringBuilder();
        sb.append(x);
        return sb.toString().equals(sb.reverse().toString());
    }

    @Test
    public void test() {
        System.out.println(isPalindrome(151));
        System.out.println(isPalindrome(15111));
    }
}
