package com.zxh.stack.queue;

import java.util.LinkedList;

/**
 * Created by z.xiaohui02 on 2016/11/15.
 */
public class StackImplementByTwoQueues {
    private LinkedList<Integer> queue1;
    private LinkedList<Integer> queue2;

    StackImplementByTwoQueues() {
        queue1 = new LinkedList<Integer>();
        queue2 = new LinkedList<Integer>();
    }

    public Integer push(Integer o) {
        if (queue1.size() == 0 && queue2.size() == 0)
            queue1.addLast(o);
        if (queue1.size() != 0)
            queue1.addLast(o);
        else if (queue2.size() != 0)
            queue2.addLast(o);
        return o;
    }

    public Integer pop() {
        Integer re = null;
        if (queue2.size() == 0 && queue1.size() == 0)
            return null;
        if (queue2.size() == 0) {
            while (queue1.size() > 0) {
                //queue2.addLast(queue1.removeFirst());
                re = queue1.removeFirst();
                if (queue1.size() != 0)
                    queue2.addLast(re);
            }
        } else if (queue1.size() == 0) {
            while (queue2.size() > 0) {
                re = queue2.removeFirst();
                if (queue2.size() != 0)
                    queue1.addLast(re);
            }
        }
        return re;

    }
}
