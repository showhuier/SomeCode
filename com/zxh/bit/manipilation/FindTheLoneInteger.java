package com.zxh.bit.manipilation;

/**
 * Created by z.xiaohui02 on 2016/11/5.
 */
public class FindTheLoneInteger {
    public static int findTheLone(int[] input){
        int value=0;
        for(int i=0;i<input.length;i++){
            value ^= input[i];
        }
        return value;
    }
}
