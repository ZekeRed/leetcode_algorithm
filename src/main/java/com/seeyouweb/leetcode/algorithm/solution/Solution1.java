package com.seeyouweb.leetcode.algorithm.solution;

import org.junit.Test;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素
 *
 * @author Zeke_Red
 * @version 1.0.0
 */
public class Solution1 {

    /**
     * 暴力破解
     */
    @Test
    public int[] towSum(){
        // 示例
        int[] nums = {2,7,11,15};
        int target = 9;

        // 解题代码
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return null;
    }
}
