package org.example;

import java.util.ArrayList;
import java.util.List;

public class listOfObjects {

    public listOfObjects(){
        System.out.println("Hola");
    }

    public static void main(String args[]){
        //List<Integer> list1= new ArrayList<>();
        List<listOfObjects> myObjectsList = new ArrayList<>();


        for(int i = 0; i < 3; i++){
            myObjectsList.add(new listOfObjects());
        }
    }
}
