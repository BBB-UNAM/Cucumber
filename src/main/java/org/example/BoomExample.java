package org.example;

public class BoomExample {
    public static void main(String args[]){
        BoomExample myObject = new BoomExample();

        Integer myArray[] = {1,2,3,4,5,6,9,989987};
        //int myArray2[] = {1,2,3,4,5,67,99};

        Integer a = 976;

        //char[] mychar = a.toString().toCharArray();

        //System.out.println(mychar[3]);

        System.out.println(myObject.analizeArray(myArray));
        //System.out.println(myObject.analizeArray(myArray2));

    }

    public String analizeArray(Integer [] myArray){
        String text = "";

        for(Integer myNumber:myArray){

            char[] mychar = myNumber.toString().toCharArray();

            if(mychar.length > 1){
                for(char myletter : mychar){
                    if(myletter == '7'){
                        text = "Boom!";
                        break;
                    }
                }
            } else {
                if(myNumber == 7){
                    text = "Boom!";
                    break;
                }
            }
        }

        if(!text.equals("Boom!")){
            text = "here is no 7 in the array";
        }

        return text;
    }
}
