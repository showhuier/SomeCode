package offer;

/**
 * Created by z.xiaohui02 on 2016/11/15.
 */
public class Fibonacci {
    public static long getFibonacci(int n) {
        if (n <= 0)
            return 0;
        if (n == 1)
            return 1;
        return (getFibonacci(n - 1) + getFibonacci(n - 2));
    }

    public static long getFibonacci2(int n){
        int[] result={0,1};
        if(n<2)
            return result[n];

        long fibNMinusOne=1;
        long fibNMinusTwo=0;
        long fibN=0;
        for(int i=2;i<=n;i++){
            fibN=fibNMinusOne+fibNMinusTwo;
            fibNMinusTwo=fibNMinusOne;
            fibNMinusOne=fibN;

        }
        return fibN;
    }
}
