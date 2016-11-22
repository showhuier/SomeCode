package com.zxh.sort.search;

import java.util.Arrays;

/**
 * Created by z.xiaohui02 on 2016/11/8.
 */
public class KSmallestElements {
    public static void swap(int[] input, int a, int b){
        int temp=input[a];
        input[a]=input[b];
        input[b]=temp;
    }
    public static int partition(int[] input, int lo, int hi){
        int pivot=input[lo];
        int i=lo;
        int j=hi+1;
        while(true){
            while(input[++i]<pivot && i<hi){
            }
            while(input[--j]>pivot){
            }
            if(i>=j)
                break;
            swap(input,i,j);
        }
        swap(input,lo,j);
        return j;
    }
    public static int[] findKSmallest(int[] input, int front, int end,int k){
        if(front>=end)
            return null;
        int partition=partition(input, front, end);
        if(partition==k)
            return Arrays.copyOfRange(input,0,partition);
        else{
            if(partition>k)
                return findKSmallest(input,front,partition,k);
            else
                return findKSmallest(input,partition+1,end,k);
        }
    }
    public static int[] findKSmallest(int[] input,int k){
        return findKSmallest(input,0,input.length-1,k);
    }
}
