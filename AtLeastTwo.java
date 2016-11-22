/**
 * Created by z.xiaohui02 on 2016/11/3.
 */

/**
 * Write a function that takes 3 booleans and return true if at least two of them are true.
 */
public class AtLeastTwo {
    public  static boolean atLeastTow(boolean a, boolean b, boolean c)
    {
        return  a? (b || c):(b && c);
    }
}
