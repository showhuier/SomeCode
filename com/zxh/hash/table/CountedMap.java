package com.zxh.hash.table;

import java.util.HashMap;

/**
 * Created by z.xiaohui02 on 2016/11/9.
 */
public class CountedMap<K,V> extends HashMap<K,V>{
    private static int numGets=0;
    private static int numPuts=0;

    @Override
    public V put(K key, V value) {
        numGets++;
        return super.put(key, value);
    }

    @Override
    public V get(Object key) {
        numPuts++;
        return super.get(key);
    }

    public int getNumGets(){
        return numGets;
    }
    public int getNumPuts(){
        return numPuts;
    }
}
