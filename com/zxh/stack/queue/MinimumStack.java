package com.zxh.stack.queue;

import java.util.Comparator;
import java.util.Stack;

/**
 * Created by z.xiaohui02 on 2016/11/9.
 */
public class MinimumStack<E extends Comparable<E>> extends Stack<E>{
    private Stack<E> minStack;
    public MinimumStack(){
        super();
        minStack=new Stack<E>();
    }

    @Override
    public E push(E item) {
        if(minStack.peek()==null)
            minStack.push(item);
        else if(item.compareTo(minStack.peek())<=0)
            minStack.push(item);
        return super.push(item);
    }

    @Override
    public synchronized E pop() {
        E element=super.pop();
        if(element.compareTo(minStack.peek())==0)
            minStack.pop();
        return element;
    }

    public E findMin(){
        return minStack.peek();
    }
}
