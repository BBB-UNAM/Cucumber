package org.example;

public class ArrayMultiplesExample extends arraySolutions {
    public static void main(String args[]){
        ArrayMultiplesExample myObject = new ArrayMultiplesExample();
        System.out.println(myObject.arrayResult(7,5)[4]);

        String result = "";
        for(int nums : myObject.arrayResult(5,10)){
            result = result + nums + ",";
        }

        result =  result.substring(0,result.length() -1);

        System.out.println("[" + result + "]");
    }
}

class arraySolutions {
    public int[] arrayResult(int num, int size){
        int arrayReturn[] = new int[size];

        for(int i=1; i < size; i++){
            if (i == (size - 1)){
                arrayReturn[i] = (i+1) * num;
            }
            arrayReturn[i-1] = i * num;
        }

        return arrayReturn;
    }
}
