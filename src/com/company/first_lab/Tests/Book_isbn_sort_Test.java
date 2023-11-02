package com.company.first_lab.Tests;

import com.company.first_lab.Classes.tasks_12_16.Book;
import com.company.first_lab.Classes.tasks_12_16.array_sorting;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Book_isbn_sort_Test {
    private Book[] test_books;
    private Book[] required_answer;
    private final int arr_len = 10;
    private void generate_test_array_and_answer(){
        test_books = new Book[arr_len];
        required_answer = new Book[arr_len];
        test_books[0] = new Book("one", "first", 1, 1);
        test_books[1] = new Book("Ariel", "Andersen", 100,2);
        test_books[2] = new Book("C++ for beginners", "life", 299,3);
        test_books[3] = new Book("451 degrees", "Bradbury", 3000,5);
        test_books[4] = new Book("Phantom of the Opera", "Leru", 50,7);
        test_books[5] = new Book("some book", "some author", 30,9);
        test_books[6] = new Book("the Job", "Azimov", 400,6);
        test_books[7] = new Book("how to sleep well", "mice", 1,4);
        test_books[8] = new Book("Halloween real story", "brains", 20,10);
        test_books[9] = new Book("empty book", "none", 0,0);

        required_answer[0] = test_books[9];
        required_answer[1] = test_books[0];
        required_answer[2] = test_books[1];
        required_answer[3] = test_books[2];
        required_answer[4] = test_books[7];
        required_answer[5] = test_books[3];
        required_answer[6] = test_books[6];
        required_answer[7] = test_books[4];
        required_answer[8] = test_books[5];
        required_answer[9] = test_books[8];
    }

    private boolean is_same(Book origin, Book clone){
        boolean are_same;
        are_same = (origin.get_author()== clone.get_author())&&(origin.get_title()== clone.get_title())&&(origin.get_price()== clone.get_price());
        return are_same;
    }

    private boolean check_all_array(Book[] required, Book[] sorted){
        boolean are_equal = true;
        for(int i=0; (are_equal)&&(i<arr_len);i++){
            are_equal = is_same(required[i], sorted[i]);
        }
        return are_equal;
    }
    @Test
    void check_sort_results(){
        generate_test_array_and_answer();
        new array_sorting().sort_by_isbn(test_books);
        Assertions.assertEquals(true,check_all_array(required_answer, test_books));
        Arrays.sort(test_books);
        Assertions.assertEquals(true,check_all_array(required_answer, test_books));
    }


}