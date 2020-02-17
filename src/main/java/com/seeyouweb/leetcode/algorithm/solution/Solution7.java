package com.seeyouweb.leetcode.algorithm.solution;

import org.junit.Test;

/**
 * 算法 第7题
 * 
 * @author Zeke_Red
 * @version 1.0.0
 */
public class Solution7 {

    @Test
    public void reverse() {
        //传入参数
        int x = 1534236469;
        boolean flag = false;
        if(x < 0){
            x = -x;
            flag = true;
        }
        StringBuffer sb = new StringBuffer().append(x).reverse();
        //return 结果
        try {
            if(flag){
                System.out.println(-Integer.valueOf(sb.toString()));
            } else {
                System.out.println(Integer.valueOf(sb.toString()));
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
