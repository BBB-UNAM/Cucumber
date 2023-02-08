package org.example;

public class Factorial {
    public static void main(String args[]){
        Factorial object = new Factorial();
        System.out.println(object.FirstFactorial(8));
    }

    public int FirstFactorial (int num){
        int result = 0;
        for(int i = num;i > 1; i--){

            if(i == num){
                result = i * (i-1);
                continue;
            }
                result = result *(i-1);

        }
        return result;
    }
}
