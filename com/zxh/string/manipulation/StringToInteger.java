package com.zxh.string.manipulation;

/**
 * Created by z.xiaohui02 on 2016/11/4.
 */
public class StringToInteger {
    public static int stringToInteger(String input){
        int i=0;
        int result=0;
        boolean isNegative=false;

        if(input.charAt(i)=='-'){
            isNegative=true;
            i++;
        }
        for(; i<input.length();i++){
            result *= 10;
            result += ((int)input.charAt(i)-48);
        }
        if(isNegative)
            result *= -1;
        return result;
    }
}
