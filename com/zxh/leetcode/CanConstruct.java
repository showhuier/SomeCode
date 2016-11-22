package com.zxh.leetcode;

import java.util.HashMap;

/**
 * Created by z.xiaohui02 on 2016/11/12.
 */
public class CanConstruct {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        char[] magaz=magazine.toCharArray();
        char[] note=ransomNote.toCharArray();
        for(int i=0;i<magaz.length;i++){
            if(map.get(magaz[i])!=null)
                map.put(magaz[i],(map.get(magaz[i]))+1);
            else
                map.put(magaz[i],1);
        }
        for(int j=0;j<note.length;j++){
            if(map.get(note[j])==null || map.get(note[j])==0)
                return false;
            else{
                map.put(note[j],map.get(note[j])-1);
            }

        }
        return true;

    }
}
