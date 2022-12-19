package com.bridgelabz;

public class Generics {

    static <P extends Comparable> void max_variables( P str1, P str2, P str3){

        if(str1.compareTo(str2) > 0){
            if(str1.compareTo(str3) > 0){
                System.out.println( str1 + " is Maximum of three given inputs ");
            }else {
                System.out.println( str3 + " is Maximum of three given inputs  ");
            }
        }else{
            if(str2.compareTo(str3) > 0){
                System.out.println( str2 + " is Maximum of three given inputs  ");
            }else{
                System.out.println( str3 + " is Maximum of three given inputs  ");
            }
        }
    }


    public static void main(String[] args) {
        max_variables(10,5000,99);
        max_variables(7.1f,119.8f,3.0f);
        max_variables("Orange", "WaterMelon", "Banana");
    }
}