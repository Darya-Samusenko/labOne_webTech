package com.company.first_lab.Classes.tasks_12_16;

import com.company.first_lab.Classes.tasks_12_16.Book;
import com.company.first_lab.Classes.tasks_12_16.comparators_basic.*;

import java.util.Comparator;

public class array_sorting {
    private void quicksort_isbn(Book[] sort_arr, int low, int high){
        if((sort_arr.length ==0)||(low>=high)) return;
        int mid_indx = low+(high-low)/2;
        Book border_element = sort_arr[mid_indx];
        int i = low;
        int j = high;
        while(i<=j){
            while(sort_arr[i].compareTo(border_element) < 0)
                i++;
            while(sort_arr[j].compareTo(border_element) > 0)
                j--;
            if(i<=j){
                Book temp = sort_arr[i];
                sort_arr[i] = sort_arr[j];
                sort_arr[j] = temp;
                i++;
                j--;
            }
        }

        if(low < j)
            quicksort_isbn(sort_arr, low,j);
        if(high > i)
            quicksort_isbn(sort_arr, i, high);
    }

    private void quicksort_nondefault(Book[] sort_arr, int low, int high, Comparator<Book> comp){
        if((sort_arr.length ==0)||(low>=high)) return;
        int mid_indx = low+(high-low)/2;
        Book border_element = sort_arr[mid_indx];
        int i = low;
        int j = high;
        while(i <= j){
            while(comp.compare(sort_arr[i], border_element) < 0)
                i++;
            while(comp.compare(sort_arr[j], border_element) > 0)
                j--;
            if(i<=j){
                Book temp = sort_arr[i];
                sort_arr[i] = sort_arr[j];
                sort_arr[j] = temp;
                i++;
                j--;
            }
        }

        if(low < j)
            quicksort_nondefault(sort_arr, i, high, comp);
        if(high > i)
            quicksort_nondefault(sort_arr, i, high, comp);
    }
    public void sort_by_isbn(Book[] original_array){
        quicksort_isbn(original_array, 0, original_array.length-1);
    }

    public void sort_by_title(Book[] origin){
        Comparator<Book> title_cmp = new title_comparator();
        quicksort_nondefault(origin, 0, origin.length-1, title_cmp);
    }

    public void sort_by_title_author(Book[] origin){
        Comparator<Book> title_auth_cmp = new title_comparator().thenComparing(new author_comparator());
        quicksort_nondefault(origin, 0, origin.length-1, title_auth_cmp);
    }

    public void sort_by_title_author_price(Book[] origin){
        Comparator<Book> title_auth_price_cmp = new title_comparator().thenComparing(new author_comparator()).thenComparing(new price_comparator());
        quicksort_nondefault(origin, 0, origin.length-1, title_auth_price_cmp);
    }

    public void sort_by_author_title(Book[] origin){
        Comparator<Book> ta_cmp = new author_comparator().thenComparing(new title_comparator());
        quicksort_nondefault(origin, 0, origin.length-1, ta_cmp);
    }

}
