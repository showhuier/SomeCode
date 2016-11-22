package com.zxh.string.manipulation;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by z.xiaohui02 on 2016/11/3.
 */
public class RemoveDuplicatesFromString {
    public static String removeDuplicates(String string)
    {
        char[] characters=string.toCharArray();
        Set<Character> charSet=new LinkedHashSet<Character>();

        for(char c:characters)
            charSet.add(c);
        StringBuilder stringBuilder=new StringBuilder();
        for(Character character:charSet)
            stringBuilder.append(character);
        return stringBuilder.toString();
    }
}
