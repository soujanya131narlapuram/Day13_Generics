package com.bridgelabz;

public class  Generics <T extends Comparable> {
    T[] array;

    Generics(T[] arr1) {
        this.array = arr1;
    }

    void maximumOfVariables(){
        T largest = this.array[0];
        for (int i=0; i<this.array.length; i++){
            if(this.array[i].compareTo(largest) > 0){
                largest = this.array[i];
                this.array[i] = largest;
            }
        }
        System.out.println(" Largest element is " + largest);
    }

    public static void main(String[] args) {
        Integer[] arr1 = {12,4,7,10,6};
        Generics <Integer> obj1 = new Generics(arr1);
        obj1.maximumOfVariables();

        String[] arr2 = {"kavya", "jaya", "ganesh"};
        Generics <String> obj2 = new Generics(arr2);
        obj2.maximumOfVariables();

        Float[] arr3 = {2.1f, 5.4f, 6.0f};
        Generics <Float> obj3 = new Generics(arr3);
        obj3.maximumOfVariables();
    }}