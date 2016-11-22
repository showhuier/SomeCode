package com.zxh.probability.randomness;

import java.util.Random;

/**
 * Created by z.xiaohui02 on 2016/11/9.
 */
public class CoinFlipsToDieRolls {
    private  static Random r=new Random();
    public static int diceRoll(){
        int result=0;
        while (result<1 || result>6){
            if(coinFlip()==1)
                result |= 1;
            if(coinFlip()==1)
                result |=2;
            if(coinFlip()==1)
                result|=4;
        }
        return result;
    }
    private static int coinFlip(){
        //return (int)(1+Math.random()*2);

        return (1+r.nextInt(2));
    }
}
