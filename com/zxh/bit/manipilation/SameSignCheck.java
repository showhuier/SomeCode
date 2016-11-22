package com.zxh.bit.manipilation;

/**
 * Created by z.xiaohui02 on 2016/11/5.
 */
public class SameSignCheck {
    public static boolean isSameSign(int x, int y){
        return ((x ^ y)>0);
    }
}
