package com.zxh.optimization;

import java.util.Arrays;
import java.util.Map;

/**
 * Created by z.xiaohui02 on 2016/11/10.
 */
public class FindNearestNeighbors {
    private static class Person implements Comparable<Person>{
        public String name;
        public int position;

        @Override
        public int compareTo(Person o) {
            return o.position-this.position;
        }
    }

    public static Person[] findNearestNeighbors(Person[] people, String target){
        Person[] neighbors=new Person[3];
        Arrays.sort(people);
        for(int i=0;i<people.length;i++){
            if(people[i].name.equals(target)){
                int before=i-1;
                int after=i+1;
                int index=0;
                while(index<3){
                    if(after <people.length && (before <0 ||
                    Math.abs(people[before].position-people[i].position)
                            > Math.abs(people[after].position-people[i].position))){
                        neighbors[index]=people[after];
                        after++;
                    }
                    else{
                        neighbors[index]=people[before];
                        before--;
                    }
                    index++;
                }
            }
        }
        return neighbors;
    }
}
