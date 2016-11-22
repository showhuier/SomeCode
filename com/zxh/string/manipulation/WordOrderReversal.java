package com.zxh.string.manipulation;

/**
 * Created by z.xiaohui02 on 2016/11/4.
 */
public class WordOrderReversal {
    private static void reverseCharacters(char[] words, int min, int max)
    {
        for(int i=0;i<(min+max)/2;i++){
            char temp=words[min+i];
            words[min+i]=words[max-1-i];
            words[max-1-i]=temp;
        }
    }

    public static char[] reverseWordOrder(char[] words){
        reverseCharacters(words,0,words.length);
        int lastSpace=0; //上一个空格位置
        for(int i=0;i<words.length;i++){
            if(words[i]==' '){
                reverseCharacters(words,lastSpace,i);
                lastSpace=i+1;
            }
        }
        reverseCharacters(words,lastSpace,words.length);//最后结尾没有空格
        return words;
    }
}
