package com.zxh.sort.search;

import java.util.Arrays;

/**
 * Created by z.xiaohui02 on 2016/11/8.
 */
public class TargetSum {
    public int[] targetSum(int[] input, int target){
        Arrays.sort(input);
        int leftPtr=0;
        int rightPtr=input.length-1;
        while(leftPtr<rightPtr){
            int sum=input[leftPtr]+input[rightPtr];
            if(sum==target){
                int answer[]={leftPtr,rightPtr};
                return answer;
            }else if(sum<target){
                leftPtr++;
            } else
                rightPtr--;
        }
        return null;
    }
}
