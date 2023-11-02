package com.company.first_lab.Tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.company.first_lab.Classes.tasks_12_16.Book;

import static org.junit.jupiter.api.Assertions.*;

class Book_clone_Test {

    private Book[] test_books;
    private final int arr_len = 10;
    private void generate_test_array(){
        test_books = new Book[arr_len];
        test_books[0] = new Book("one", "first", 1);
        test_books[1] = new Book("Ariel", "Andersen", 100);
        test_books[2] = new Book("C++ for beginners", "life", 299);
        test_books[3] = new Book("451 degrees", "Bradbury", 3000);
        test_books[4] = new Book("Phantom of the Opera", "Leru", 50);
        test_books[5] = new Book("some book", "some author", 30);
        test_books[6] = new Book("the Job", "Azimov", 400);
        test_books[7] = new Book("how to sleep well", "mice", 1);
        test_books[8] = new Book("Halloween real story", "brains", 20);
        test_books[9] = new Book("empty book", "none", 0);
    }
    private boolean is_same(Book origin, Book clone){
        boolean are_same;
        are_same = (origin.get_author()== clone.get_author())&&(origin.get_title()== clone.get_title())&&(origin.get_price()== clone.get_price());
        return are_same;
    }

    @Test
    void testClone() {
        generate_test_array();
        for(int i = 0; i<arr_len;i++){
            Book curr_clone = test_books[i].clone();
            Assertions.assertEquals(true, is_same(test_books[i], curr_clone));
        }
    }
}