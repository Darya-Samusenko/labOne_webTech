package com.company.first_lab.Classes;

public class array_sort_class {
    private int[] arr;
    public int[] sort_array(){
        for(int i=0; i< arr.length-1; i++){
            if(arr[i+1] < arr[i]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                i -=2;
            }
        }
        return arr;
    }
    public array_sort_class(int[] original_array){
        this.arr = original_array;
    }
}
