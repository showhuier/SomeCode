package com.zxh.probability.randomness;

/**
 * Created by z.xiaohui02 on 2016/11/9.
 */
public class RandomNumberShuffling {
    public static int[] shuffleArray(int[] input) {
        for (int i = 0; i < input.length; i++) {
            int swap = i + (int) (Math.random() * (input.length - i));
            int temp = input[i];
            input[i] = input[swap];
            input[swap] = temp;
        }
        return input;
    }
}
