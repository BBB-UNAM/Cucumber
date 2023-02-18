package org.example;

public class CountArrays implements myInterface{
    public static void main(String args[]){
        char[][] matrix = {{'d','f'},{'g','h'},{'g','h'}};


        for(char[] mymatrix: matrix){
            for (Character  myChar: mymatrix){
                System.out.println(myChar);
            }
        }
        CountArrays object = new CountArrays();
        System.out.println(object.countLetter(matrix));
    }

    @Override
    public int countLetter(char[][] matrixx) {
        int counter1 = matrixx.length;
        int counter2 = matrixx[0].length;
        return counter1 * counter2;
    }
}

interface myInterface{
    int countLetter(char[][] matrix);
}
