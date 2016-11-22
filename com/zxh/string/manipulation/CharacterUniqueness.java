package com.zxh.string.manipulation;

import java.util.HashSet;

/**
 * Created by z.xiaohui02 on 2016/11/3.
 */
public class CharacterUniqueness {
    public static boolean isUnique(String str)
    {
        if(str.isEmpty())
            return false;

        HashSet<Character> map=new HashSet<Character>();
        char[] characters = str.toCharArray();
        for(int i=0;i<characters.length;i++)
        {
            if(map.contains(characters[i]))
                return false;
            else
                map.add(characters[i]);
        }
        return true;
    }
}
