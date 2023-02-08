package org.example;

import java.util.ArrayList;

public class tableCodilityExample1 {
    public static void main (String args[]){
        System.out.println("hola");
        tableCodilityExample1 object =  new tableCodilityExample1();

        System.out.println(object.solution("id,name,age,score\n1,jack,NULL,12\n17,Betty,28,11"));
    }

    public String solution(String S){

        String result = "";

        String[] row = S.split("\n");
        ArrayList<String> data = new ArrayList<String>();

        System.out.println(row[0]);

        for (int i = 0; i < row.length; i++) {
            data.add(row[i]);
        }

        System.out.println(data.get(2));

        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).contains(",NULL,") || data.get(i).contains("NULL\n") || data.get(i).contains(",NULL")) {
                data.remove(i);
            }
        }

        for (int i = 0; i < data.size(); i++) {
            result += data.get(i) + "\n";
        }

        System.out.println(result);
        String finalerString = result.substring(0, result.length() - 1);
        return finalerString;
    }
}
