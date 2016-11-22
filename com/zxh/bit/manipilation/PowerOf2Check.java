package com.zxh.bit.manipilation;

/**
 * Created by z.xiaohui02 on 2016/11/5.
 */
public class PowerOf2Check {
    public static boolean isPowerOfTwo(int x){
        return (x>0)&&((x & (x-1))==0);
    }
}
