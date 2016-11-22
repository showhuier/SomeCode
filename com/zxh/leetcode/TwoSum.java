package com.zxh.leetcode;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by z.xiaohui02 on 2016/11/9.
 */
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = null;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int find = target - nums[i];
            Integer idx = map.get(find);
            if (idx != null && idx != i) {
                result = i > idx ? (new int[]{idx, i}) : (new int[]{i, idx});
                break;
            }
        }
        return result;
    }
}

