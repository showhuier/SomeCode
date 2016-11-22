package com.zxh.hash.table;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by z.xiaohui02 on 2016/11/9.
 */
public class GenerateAllValidAnagrams {
    private static HashMap<String, List<String>> map = new HashMap<String, List<String>>();

    public static void preCompute(List<String> englishDictionary) {
        for (String word : englishDictionary) {
            char[] letters = word.toCharArray();
            Arrays.sort(letters);
            String sortedWord = String.valueOf(letters);

            if (map.get(sortedWord) != null) {
                map.get(sortedWord).add(word);
            } else {
                List<String> words = new ArrayList<String>();
                words.add(word);
                map.put(sortedWord, words);
            }
        }
    }

    public static List<String> getAnagrams(String input) {
        char[] letters = input.toCharArray();
        String sortedWord = String.valueOf(letters);
        return map.get(sortedWord);
    }

    /**
     * Created by z.xiaohui02 on 2016/11/16.
     */
    public static class Question11 {
        public static boolean g_InvalidInput=false;

        public static double power(double base, int exponent){
            g_InvalidInput=false;
            if(equal(base,0.0) && exponent<0)
            {
                g_InvalidInput=true;
                return 0;
            }
            int absExponent=Math.abs(exponent);

            double result=powerWithExponentByRecurse(base,absExponent);
            if(exponent<0)
                result=1.0/result;
            return result;
        }

        public static boolean equal(double num1, double num2){
            if(num1-num2>-0.0000001 && num2-num1<0.0000001)
                return true;
            else
                return false;
        }

        public static double powerWithUnsignedExponent(double base, int exponent){
            double result=1.0;
            for(int i=1;i<=exponent;i++){
                result *= base;
            }
            return result;
        }
        public static double powerWithExponentByRecurse(double base, int exponent){
            if(exponent==0)
                return 1;
            if(exponent==1)
                return base;

            double result=powerWithExponentByRecurse(base,exponent>>1);
            result *=result;
            if((exponent & 0x1)!=0)
                result *=base;

            return result;
        }
    }
}
