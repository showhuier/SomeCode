package com.zxh.sort.search;

/**
 * Created by z.xiaohui02 on 2016/11/7.
 */
public class BinartSearch {
    public static int findValue(int[] input, int value){
        return binarySearch(input,value,0,input.length-1);
    }
    private static int binarySearch(int[] input,int target, int lo, int hi){
        int mid=(lo+hi)/2;
        if(hi<lo)
            return -1;
        if(target==input[mid])
            return mid;
        else if(target<input[mid])
            return binarySearch(input,target,lo,mid-1);
        else
            return binarySearch(input,target,mid+1,hi);
    }
}
