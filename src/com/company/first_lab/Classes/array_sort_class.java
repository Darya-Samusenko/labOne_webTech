package com.company.first_lab.Classes;

public class array_sort_class {

    public int[] sort_array(int[] arr){
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
}
