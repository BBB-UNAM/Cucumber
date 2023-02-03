package org.example;

public class FindRepeatedLeter {
    public static void main (String args[]){
        //String cadena = "Codility";
        FindRepeatedLeter objeto = new FindRepeatedLeter();
        System.out.println(objeto.detectarLetra("aba"));
    }

    public char detectarLetra(String cadena){
        char letra = 0;

        for(int i=0;i < cadena.length(); i++){
            for (int e =0; e < cadena.length();e++){

                if(i==e){
                    continue;
                }

                if(cadena.charAt(i)==cadena.charAt(e)){
                    letra = cadena.charAt(i);
                    break;
                }
            }
        }
        return letra;
    }
}
