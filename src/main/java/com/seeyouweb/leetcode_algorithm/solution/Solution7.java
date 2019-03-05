/**
 * Copyright (c) 2018-2019 Seeyouweb.  All rights reserved. 广州西柚网络科技有限公司 版权所有.
 * 请勿修改或删除版权声明及文件头部.
 */
package com.seeyouweb.leetcode_algorithm.solution;

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
        int x = 1534236469;    //传入参数
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
