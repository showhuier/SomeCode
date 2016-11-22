package com.zxh.bit.manipilation;

/**
 * Created by z.xiaohui02 on 2016/11/5.
 */
public class SwapInPlace {
    public static void swapInPlace(int a, int b){
        a=a ^ b;
        b=a ^ b;
        a=a ^ b;
    }
}
