package org.example;


import org.apache.commons.lang3.ArrayUtils;

public class tableCodilityExample2 {
    public static void main(String args[]){

        tableCodilityExample2 object = new tableCodilityExample2();

        System.out.println(object.solucion("id,name,age,score\n1,jack,NULL,12\n17,Betty,28,11"));
    }

    public String solucion(String S){
        String [] row = S.split("\n");
        String [] data = new String[0];
        String result = "";

        for (int i =0; i< row.length; i++){
            //System.out.println(row[i].contains("NULL"));
            if(row[i].contains("NULL")){
                data = ArrayUtils.removeElement(row,row[i]);
            }
        }

        for(int i =0; i < data.length; i++){
            result =result + data[i] + "\n";
        }

        return result.substring(0,result.length() -1);
    }
}
