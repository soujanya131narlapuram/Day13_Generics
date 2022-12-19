package com.bridgelabz;

public class  Generics <T extends Comparable> {
    T vble1;
    T vble2;
    T vble3;

    Generics(T var1, T var2, T var3){   // parameterized constructor is used to initialize instance variable of objects
        this.vble1 = var1;
        this.vble2 = var2;
        this.vble3 = var3;
    }

    void maximumOfVariables(){
        if(this.vble1.compareTo(this.vble2) > 0){
            if(this.vble1.compareTo(this.vble3) > 0){
                System.out.println( this.vble1 + " is Maximum of three variables");
            }else {
                System.out.println( this.vble3 + " is Maximum of three variables ");
            }
        }else{
            if(this.vble2.compareTo(this.vble3) > 0){
                System.out.println( this.vble2 + " is Maximum of three variables ");
            }else{
                System.out.println( this.vble3 + " is Maximum of three variables ");
            }
        }
    }
    public static void main(String[] args) {
        Generics <Integer> obj1 = new Generics(60, 1, 45);
        obj1.maximumOfVariables();

        Generics <String> obj2 = new Generics("Orange", "Banana","WaterMelon");
        obj2.maximumOfVariables();

        Generics <Float> obj3 = new Generics(5.3f, 7.1f, 10.7f);
        obj3.maximumOfVariables();
    }
}
