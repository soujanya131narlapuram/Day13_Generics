package com.bridgelabz;

public class  Generics <T extends Comparable> {
    T[] array;

    Generics(T[] arr1) {
        this.array = arr1;
    }

    void max_variables(){
        T largest = this.array[0];
        for (int i=0; i<this.array.length; i++){
            if(this.array[i].compareTo(largest) > 0){
                largest = this.array[i];
                this.array[i] = largest;
            }
        }
        System.out.println(" Largest element in the array is " + largest);
    }

    public static void main(String[] args) {
        Integer[] int_arr = {14,77,11,1,56};
        Generics <Integer> obj1 = new Generics(int_arr);
        obj1.max_variables();

        String[] st_arr = {"Soujanya", "Sravan", "Ashok","Ramesh"};
        Generics <String> obj2 = new Generics(st_arr);
        obj2.max_variables();

        Float[] float_arr = {25.1f, 4.3f, 7.1f};
        Generics <Float> obj3 = new Generics(float_arr);
        obj3.max_variables();
    }}