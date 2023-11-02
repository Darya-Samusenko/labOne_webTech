package com.company.first_lab.Tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.company.first_lab.Classes.two_sequences_class;
import static org.junit.jupiter.api.Assertions.*;

class two_sequences_classTest {
    private final int[] test_sequence_a = {2,5,6,8,9,12,14};
    private final int[] test_sequence_b = {3,4,10,11,13};
    private final int[] required_answer = {0,0,4,4,5};
    private boolean are_same(int[] one, int[] two){
        boolean are_equal = (one.length==two.length);
        for(int i=0;(are_equal)&&(i<one.length);i++)
            are_equal = one[i]==two[i];
        return are_equal;
    }
    @Test
    void places_to_insert() {
        two_sequences_class finder = new two_sequences_class();
        int[] res = finder.places_to_insert(test_sequence_a,test_sequence_b);
        Assertions.assertEquals(true, are_same(required_answer, finder.places_to_insert(test_sequence_a,test_sequence_b)));
    }
}