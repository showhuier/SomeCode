import com.zxh.leetcode.AddString;
import offer.Fibonacci;

import java.util.*;

/**
 * Created by z.xiaohui02 on 2016/11/4.
 */
public class Test {
    public static void main(String[] args) {
/*        String s="7956132";
        int result=com.zxh.string.manipulation.StringToInteger.stringToInteger(s);
        System.out.print(result);*/
//        String one="ABCBDAB";
//        String two="BDCABCBDA";
//        int result= LongestCommonSubstring.longestCommonSubstring(one,two);
//        int result= Computing2x.twoToThe(33);
//        System.out.print(result+"");

//        int a=0b1011;
//        System.out.print((a ^ 0b1111));

//        int[] a= new int[]{0,0,2,8,2,3,3,4,4,5,5};
//        int result= FindTheLoneInteger.findTheLone(a);
//        System.out.print(result);
/*        int x=100,y=500;
        if(SameSignCheck.isSameSign(x,y))
            System.out.print("same");
        else
            System.out.print("opposite");*/
        // System.out.print(Integer.MIN_VALUE);

//        int a[] = {4,2,1,7,5,3,8,10,9,6};
//        int K = 5;
//        int[] aa= KSmallestElements.findKSmallest(a,K);
//        System.out.print(Arrays.toString(aa));

//        char a='1';
//        System.out.print((int)a);
//        String s="world";
//        modifyString(s);
//        System.out.print(s);

//        int[] a1={10,0,0,0};
//        int[] a2={1,3,5};
//        sort(a1,a2,1);
//        System.out.print(Arrays.toString(a1));

//        long a= Fibonacci.getFibonacci2(2);
//        System.out.print(a);

        String s1="456";
        String s2="789";
        String ss= AddString.addStrings(s1,s2);
        System.out.print(ss);
    }


    public static void modifyString(String input){
        input ="hello";
    }

    public static void sort(int[] a1, int[] a2, int aLength){
        int tailPtr=a1.length-1;
        int a1Ptr= aLength-1;
        int a2Ptr=a2.length-1;
        for(int i=tailPtr;i>=0;i--){
            if(a2Ptr<0)
                //a1[i]=a1[a1Ptr--];
                break;
            else if(a1Ptr<0)
                a1[i]=a2[a2Ptr--];
            else {
                if (a1[a1Ptr] >= a2[a2Ptr])
                    a1[i] = a1[a1Ptr--];
                else
                    a1[i] = a2[a2Ptr--];
            }
        }
    }
}
