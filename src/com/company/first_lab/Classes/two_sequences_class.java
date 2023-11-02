package com.company.first_lab.Classes;

public class two_sequences_class {
    //использую бинарный поиск для нахождения мест
    private int binary_search(int[] arr, int left_border, int right_border, int sorted_element) {
        int m = -1;
        if (sorted_element <= arr[left_border])
            return left_border;
        if (sorted_element >= arr[right_border])
            return right_border;
        while (left_border <= right_border) {
            m = (left_border + right_border) / 2;
            if (sorted_element >= arr[m] && sorted_element < arr[m + 1])
                return m + 1;
            if (sorted_element < arr[m])
                right_border = m - 1;
            if (sorted_element > arr[m])
                left_border = m + 1;
        }
        return m;
    }
    public int[] places_to_insert(int[] sequence_a, int[] sequence_b){
        int[] all_places = new int[sequence_b.length];
        for(int i = 0; i < sequence_b.length;i++){
            all_places[i] = binary_search(sequence_a, 0, sequence_a.length - 1, sequence_b[i]);
        }
        return all_places;
    }
}
