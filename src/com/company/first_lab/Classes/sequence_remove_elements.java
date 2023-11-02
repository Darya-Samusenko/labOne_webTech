package com.company.first_lab.Classes;

public class sequence_remove_elements {
    private boolean is_sorted_properly(int[] sequence){
        boolean is_sort=true;
        for (int i = 0; (i <sequence.length-1)&&(is_sort) ; i++) {
            if(sequence[i]>sequence[i+1]){
                is_sort=false;
            }
        }
        return is_sort;
    }

    private int binary_search(int[] arr, int l, int r, int sElem){
        int m = -1;
        if (sElem < arr[l])
            return l;
        if (sElem > arr[r])
            return r;
        while (l <= r) {
            m = (l + r) / 2;
            if (sElem >= arr[m] && sElem < arr[m + 1])
                return m + 1;
            if (sElem < arr[m])
                r = m - 1;
            if (sElem > arr[m])
                l = m + 1;
        }
        return m;
    }
    public int find_quantity_of_elements_to_remove(int[] sequence){
        int k_num = 0;
        if(!is_sorted_properly(sequence)){

        }
        return k_num;
    }
}
