package com.zxh.sort.search;

/**
 * Created by z.xiaohui02 on 2016/11/8.
 */
public class SearchOnASortedArray {
    public static int rotatedSearch(int[] input, int min, int max, int x){
        if(input[min]==x)
            return min;
        else if(input[max]==x)
            return max;
        else if(max-min==1)
            return -1;

        int mid=(min+max)/2;
        if(input[mid]>=input[min]){
            if(x>=input[min] && x<=input[mid])
                return rotatedSearch(input,min,mid,x);
            else
                return rotatedSearch(input,mid,max,x);
        }else{
            if(x>=input[mid] && x<=input[max])
                return rotatedSearch(input,mid,max,x);
            else
                return rotatedSearch(input,min,mid,x);
        }

    }
}
