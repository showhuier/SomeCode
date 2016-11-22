package com.zxh.leetcode;

/**
 * Created by z.xiaohui02 on 2016/11/16.
 */
public class AddString {
    public static String addStrings(String num1, String num2) {
        if (num1.length() == 0)
            return num2;
        if (num2.length() == 0)
            return num1;

        int num1Ptr = num1.length() - 1;
        int num2Ptr = num2.length() - 1;
        StringBuilder builder = new StringBuilder();
        int carry = 0;
        while (num1Ptr >= 0 || num2Ptr >= 0) {
            int firstValue = 0;
            int secondValue = 0;
            if (num1Ptr >= 0)
                firstValue = (int) num1.charAt(num1Ptr--) - '0';
            if (num2Ptr >= 0)
                secondValue = (int) num2.charAt(num2Ptr--) - '0';
            int sum = (firstValue + secondValue + carry) % 10;
            carry = (firstValue + secondValue + carry) / 10;
            builder.append(Integer.toString(sum));
        }

        if (carry != 0)
            builder.append(Integer.toString(carry));

        StringBuilder re = builder.reverse();
        return re.toString();
    }
}
