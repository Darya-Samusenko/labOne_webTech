package com.company.first_lab.Classes.tasks_12_16.comparators_basic;

import java.util.Comparator;
import com.company.first_lab.Classes.tasks_12_16.Book;
public class author_comparator implements Comparator<Book>{
    @Override
    public int compare(Book o1, Book o2) {
        return (o1.get_author()).compareTo(o2.get_author());
    }
}
