package com.zxh.leetcode;

import java.util.*;

/**
 * Created by z.xiaohui02 on 2016/11/14.
 */
public class Intersection {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> result = new LinkedHashSet<Integer>();
        int lenFirst = nums1.length;
        int lenSecond = nums2.length;
        if (lenFirst == 0 || lenSecond == 0)
            return null;

        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < lenFirst; i++)
            set.add(nums1[i]);

        for (int i = 0; i < lenSecond; i++) {
            if (set.contains(nums2[i])) {
                result.add(nums2[i]);
            }
        }
        int[] res = new int[result.size()];
        int k = 0;
        Iterator<Integer> it = result.iterator();
        while (it.hasNext())
            res[k++] = it.next();

        return res;
    }

    public int[] intersect2(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0)
            return new int[0];

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums1.length; i++) {
            if (map.containsKey(nums1[i]))
                map.put(nums1[i], map.get(nums1[i]) + 1);
            else
                map.put(nums1[i], 1);
        }

        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < nums2.length; i++) {
            Integer get = map.get(nums2[i]);
            if (get != null && get > 0) {
                list.add(nums2[i]);
                map.put(nums2[i], get - 1);
            }
        }
        Iterator<Integer> iter = list.iterator();
        int[] result = new int[list.size()];
        int k = 0;
        while (iter.hasNext()) {
            result[k++] = iter.next();
        }
        return result;
    }
}
