package com.zxh.optimization;

/**
 * Created by z.xiaohui02 on 2016/11/10.
 */
public class MaximalSubarray {
    public int maxSubArray(int[] nums) {
        int localMax=nums[0];
        int globalMax=nums[0];
        for(int i=1;i<nums.length;i++){
            if(localMax>=0)
                localMax += nums[i];
            else
                localMax=nums[i];
            //startPos=i

            if(localMax>globalMax)
                globalMax=localMax;
            //endPos=i;
        }
        return globalMax;

    }
}
