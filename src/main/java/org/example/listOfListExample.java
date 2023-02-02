package org.example;

import org.checkerframework.framework.qual.DefaultQualifier;

import java.util.ArrayList;
import java.util.List;

public class listOfListExample {
    public static void main (String args[]){
        List<Integer> myLista = new ArrayList<>();
        //myLista.add(5);
        //myLista.add(10);

        //for(Integer numeros: myLista){
            System.out.println(myLista);
        //}

        List<List<Integer>> listOflist = new ArrayList<>();

        int m = 3;
        int n = 4;

        for(int i = 0; i < m;i++){
            listOflist.add(new ArrayList<>());
        }

        for(List<Integer> theList : listOflist){
            for(int i = 0; i < n;i++){
                theList.add(n);
            }
        }

        System.out.println(listOflist.get(0).get(1));
    }
}
