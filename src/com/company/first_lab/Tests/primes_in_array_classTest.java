package com.company.first_lab.Tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.company.first_lab.Classes.primes_in_array_class;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class primes_in_array_classTest {

    private final int[] test_arr={2,4,6,8,3,6,4,5,7,11,13,51,23,31,33,34};
    private final int[] required_answer = {0,4,7,8,9,10,12,13};
    private boolean are_same(int[] one, int[] two){
        boolean are_equal = (one.length==two.length);
        for(int i=0;(are_equal)&&(i<one.length);i++)
            are_equal = one[i]==two[i];
        return are_equal;
    }
    @Test
    void find_all_primes() {
        primes_in_array_class finder = new primes_in_array_class();
        ArrayList<Integer> positions = finder.find_all_primes(test_arr);
        int[] comp_arr = new int[positions.size()];
        for(int i=0;i<comp_arr.length;i++){
            comp_arr[i] = positions.get(i);
        }
        boolean res = are_same(required_answer, comp_arr);
        Assertions.assertEquals(true, res);
    }
}