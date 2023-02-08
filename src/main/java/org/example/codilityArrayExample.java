package org.example;

import java.util.Arrays;

public class codilityArrayExample {
    public static void main(String args[]){
        int array[] = {1,3,6,4,1,2};
        //System.out.println(array[1]);

        codilityArrayExample object = new codilityArrayExample();
        System.out.println(object.solution(array));
    }

    public int solution(int[] A) {
        int number=0;
        int i=0;
        int N =100000;

        Arrays.sort(A);
        int[] B = Arrays.stream(A).distinct().toArray();

        try {

            for(i = 0; i < N; i++){
                if((i + 1) != B[i]){
                    number = i + 1;
                    break;
                }

                if(A[i]< 0){
                    number = 1;
                    break;
                }
            }

        } catch (Exception e){
            number = i+1;
        }
        return number;
    }
}
