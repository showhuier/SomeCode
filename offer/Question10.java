package offer;

/**
 * Created by z.xiaohui02 on 2016/11/15.
 */
public class Question10 {
    public int numberOfOne(int n) {   //对于负数可能产生死循环
        int count = 0;
        while (n != 0) {
            if ((n & 1) != 0)
                count++;
            n = n >> 1;
        }
        return count;
    }

    public int numberOfOne1(int n) {
        int flag = 1;
        int count = 0;
        while (flag != 0) {
            if ((flag & n) != 0)
                count++;
            flag = flag << 1;
        }
        return count;
    }

    public int numberOfOne2(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n & (n - 1);
        }
        return n;
    }
}
