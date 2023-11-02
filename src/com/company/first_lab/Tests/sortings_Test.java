package com.company.first_lab.Tests;

import com.company.first_lab.Classes.tasks_12_16.Book;
import com.company.first_lab.Classes.tasks_12_16.comparators_basic.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.util.Arrays;

public class sortings_Test {
    private final int ARR_LEN = 5;
    private final Book[] unsorted_arr = {
            new Book("book one", "author E", 100),
            new Book("book two", "author D", 300),
            new Book("book three", "author C", 200),
            new Book("book four", "author B", 400),
            new Book("book five", "author A", 500),
    };
    private final int[] sorted_by_name_indexes = {0,1,2,3,4};
    private final int[] sorted_by_name_author_indexes = {0,1,2,3,4};
    private final int[] sorted_by_author_name_indexes = {4,3,2,1,0};
    private final int[] sorted_by_author_name_price_indexes = {4,3,2,1,0};

    private boolean sorted_correct(Book[] sorted_arr, int[] indexes){
        boolean is_correct = true;
        for(int i =0;(is_correct)&&(i< ARR_LEN);i++){
            is_correct = (sorted_arr[i].compareTo(unsorted_arr[(indexes[i])])==0);
        }
        return is_correct;
    }
    @Test
    void test_title_sort(){
        Book[] array_to_sort  = unsorted_arr;
        Arrays.sort(array_to_sort, new title_comparator());
        Assertions.assertEquals(true, sorted_correct(array_to_sort, sorted_by_name_indexes));
        Arrays.sort(array_to_sort, new title_comparator().thenComparing(new author_comparator()));
        Assertions.assertEquals(true, sorted_correct(array_to_sort, sorted_by_name_author_indexes));
        Arrays.sort(array_to_sort, new author_comparator().thenComparing(new title_comparator()));
        Assertions.assertEquals(true, sorted_correct(array_to_sort, sorted_by_author_name_indexes));
        Arrays.sort(array_to_sort, new author_comparator().thenComparing(new title_comparator().thenComparing(new price_comparator())));
        Assertions.assertEquals(true, sorted_correct(array_to_sort, sorted_by_author_name_price_indexes));
    }
}
