package com.zxh.string.manipulation;

/**
 * Created by z.xiaohui02 on 2016/11/3.
 * Given two strings, write a function to check if one string is a rotation of the other
 */
public class StringRotation {
    public static boolean isRotation(String one, String two)
    {
        return (one.length()==two.length())&&
                ((one+one).indexOf(two)!=-1);
    }
}
