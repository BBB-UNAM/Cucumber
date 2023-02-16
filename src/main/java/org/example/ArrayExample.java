package org.example;

public class ArrayExample {
    public static void main(String args[]){
        int array[] = {1,2,3,0,};
        int array2[] = new int[4];

        array2[0] = 1;

        System.out.println();

        ArrayExample object = new ArrayExample();

        System.out.println(object.numbers(array));

    }

    public String numbers(int arrays[]){
        String numbersChar="";
        int counter = 0;


        for(int i=0; i< arrays.length; i++){
            for (int j=0; j< arrays.length; j++){

                if(i == j){
                    continue;
                }

                if(arrays[i] + arrays [j] == 3){
                    numbersChar = numbersChar + String.valueOf(arrays[i]) + ":" + String.valueOf(arrays[j]) + ",";
                }
            }
        }

        numbersChar = numbersChar.substring(0,numbersChar.length()-1);

        String finalResult[] = numbersChar.split(",");

        numbersChar = "";

        for (int o=0; o < finalResult.length; o=o+2){
            numbersChar = numbersChar + "," + finalResult[o];
        }
        return numbersChar.substring(1,numbersChar.length());
    }
}
