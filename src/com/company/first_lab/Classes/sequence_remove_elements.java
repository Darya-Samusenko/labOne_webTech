package com.company.first_lab.Classes;

public class sequence_remove_elements {
    private final int MIN = -2147483648;
    private final int MAX = +2147483647;
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
        if(!is_sorted_properly(sequence)) {
            int n = sequence.length;
            int new_sequence_length = 0;


            int[] extraArray = new int[n];
            extraArray[0]=MIN;
            for (int i = 1; i < n; i++)
                extraArray[i] = MAX;

            for (int i = 0; i < n - 1; i++) {
                int j=binary_search(extraArray,0,n-1,sequence[i]);
                if (extraArray[j-1]<sequence[i] && sequence[i] < extraArray[j]){
                    extraArray[j]=sequence[i];
                    new_sequence_length=Math.max(new_sequence_length,j);
                }
            }
            k_num = n-new_sequence_length;
        }
        return k_num;
    }
}
