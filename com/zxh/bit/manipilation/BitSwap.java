package com.zxh.bit.manipilation;

/**
 * Created by z.xiaohui02 on 2016/11/5.
 */
public class BitSwap {
    public static byte swapBits(byte x){
        return (byte)(((x & 0xf0)>>4) | ((x & 0x0f)<<4));
    }
}
