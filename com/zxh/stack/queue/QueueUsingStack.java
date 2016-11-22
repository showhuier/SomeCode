package com.zxh.stack.queue;

import java.util.Stack;

/**
 * Created by z.xiaohui02 on 2016/11/9.
 */
public class QueueUsingStack {
    public class Queue<E>{
        private Stack<E> incoming=new Stack<E>();
        private Stack<E> outgoing=new Stack<E>();

        public void queue(E item){
            incoming.push(item);
        }

        public E dequeue(){
            if(outgoing.isEmpty()){
                while(!incoming.isEmpty()){
                    outgoing.push(incoming.pop());
                }
            }
            return outgoing.pop();
        }

    }
}
