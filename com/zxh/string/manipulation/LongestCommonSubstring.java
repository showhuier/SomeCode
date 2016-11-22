package com.zxh.string.manipulation; /**
 * Created by z.xiaohui02 on 2016/11/5.
 */

/**
 * 最长公共子串和最长公共子序列不是一个问题，最长公共子序列不需要子序列连续
 */
public class LongestCommonSubstring {
    public static int longestCommonSubstring(String one, String two){
        int m=one.length();
        int n=two.length();

        if(n==0 || m==0)
            return 0;
        int maxLength=0;
        int[][] memoized=new int[m][n];

//        for(int i=0;i<m;i++)
//            memoized[i][0]=0;
//        for(int i=0;i<n;i++)
//            memoized[0][n]=0;

        for(int j=0;j<m;j++)
        {
            for(int i=0;i<n;i++)
            {
                if(one.charAt(j)==two.charAt(i)){
                    if(j==0 || i==0)
                        memoized[j][i]=1;
                    else
                        memoized[j][i]=memoized[j-1][i-1]+1;
                    if(memoized[j][i]>maxLength)
                        maxLength=memoized[j][i];
                }
            }
        }
        return maxLength;
    }
}
