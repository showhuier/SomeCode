package com.zxh.optimization;

/**
 * Created by z.xiaohui02 on 2016/11/10.
 */
public class StockMarketTiming {
    public static int findBiggestProfit(int[] days){
        int minPrice=days[0];
        int maxProfit=0;
        for(int i=1;i<days.length;i++){
            if(days[i]<minPrice)
                minPrice=days[i];
            int currentProfit=days[i]-maxProfit;
            if(currentProfit>maxProfit)
                maxProfit=currentProfit;
        }
        return maxProfit;
    }
}
