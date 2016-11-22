package offer;

/**
 * Created by z.xiaohui02 on 2016/11/14.
 */
public class Question4 {
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
