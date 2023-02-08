package org.example;

public class CadenaRevesa {
    public static void main(String args[]){
        System.out.println(CadenaRevesa.FirstReverse("hola"));
    }
    public static String FirstReverse(String str) {
        String cadena ="";
        for(int i = str.length() -1; i>-1; i-- ){
            cadena = cadena + str.charAt(i);
        }
        return cadena;
    }
}
