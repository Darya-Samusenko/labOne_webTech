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
            boolean cont_search = false;
            int[] flags_arr = new int[sequence.length];
            int step_element = 0;
            do{
                int j = step_element;
                int i = step_element+1;
                for(;i<sequence.length;i++) {
                    if (sequence[j] < sequence[i])
                        flags_arr[i] = 1;
                    else {
                        if (sequence[j] > sequence[i])
                            flags_arr[i] = -1;
                        else
                            flags_arr[i] = 0;
                    }
                    if (flags_arr[i] != -1)
                        j = i;
                }
                int check_num = 0;
                for(int z=0;z < flags_arr.length; z++){
                    if(flags_arr[z] < 0)
                        check_num++;
                }
                cont_search = !((check_num <= flags_arr.length/2)||(check_num < 2)||(step_element == flags_arr.length));
                if(cont_search)
                    step_element++;
            }
            while(cont_search);
            for(int z=0;z < flags_arr.length; z++){
                if(flags_arr[z] < 0)
                    k_num++;
            }
        }
        return k_num;
    }
}
