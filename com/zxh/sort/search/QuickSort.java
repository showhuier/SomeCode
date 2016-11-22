package com.zxh.sort.search;

/**
 * Created by z.xiaohui02 on 2016/11/8.
 */
public class QuickSort {
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
    public static void quickSort(int[] input, int lo, int hi){
        if(lo>=hi)
            return;
        int partition=partition(input,lo,hi);
        quickSort(input,lo,partition-1);
        quickSort(input,partition+1,hi);
    }
}
