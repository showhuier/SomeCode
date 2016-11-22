package com.zxh.probability.randomness;

/**
 * Created by z.xiaohui02 on 2016/11/9.
 */
public class RandomRangeExpansion {
    public static int randomNumber7() {
        int[][] values = {{1, 1, 1, 2, 2}, {2, 3, 3, 3, 4},
                {4, 4, 5, 5, 5}, {6, 6, 6, 7, 7}, {7, 0, 0, 0, 0}};

        int result = 0;
        while (result == 0) {
            int i = randomNumber5();
            int j = randomNumber5();
            result = values[i - 1][j - 1];
        }
        return result;
    }

    public static int randomNumber5() {
        return (int) (1 + Math.random() * 5);
    }
}
