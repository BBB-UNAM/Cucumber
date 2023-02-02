package org.example;

import java.util.HashMap;
import java.util.Map;

public class mapExample {
    public static void main(String args[]){
        Map<Integer,String> myMap = new HashMap<>();
        myMap.put(1,"Alberto");
        myMap.put(2,"Daniel");
        myMap.put(3,"Picasso");
        myMap.put(4,"Gonzalez");
        System.out.println(myMap);
        System.out.println(myMap.get(1));

    }
}
