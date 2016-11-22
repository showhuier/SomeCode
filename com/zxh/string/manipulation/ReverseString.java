package com.zxh.string.manipulation;

/**
 * Created by z.xiaohui02 on 2016/11/3.
 */
public class ReverseString {
    public static String reverse(String input)
    {
        StringBuilder builder=new StringBuilder();
        char[] characters=input.toCharArray();
        for(int i=characters.length-1;i>=0;i--)
        {
            builder.append(characters[i]);
        }
        //builder.reverse()

        return builder.toString();
    }
}
