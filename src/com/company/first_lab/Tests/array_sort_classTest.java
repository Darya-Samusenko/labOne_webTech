package com.company.first_lab.Tests;

import com.company.first_lab.Classes.array_sort_class;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.util.Arrays;

class array_sort_classTest {
    private final int TEST_ITERATIONS_QUANTITY = 100;
    private final int ARRAY_MAX_LENGTH_IN_TEST = 200;
    private final int ARRAY_MAX_ELEMENT_VALUE = 100;
    private final int ARRAY_MIN_ELEMENT_VALUE = -100;
    int[] generateArray(){
        int arrLen = (int)((Math.random()*(ARRAY_MAX_LENGTH_IN_TEST-2))+2);
        int[] testArray = new int[arrLen];
        for(int i=0;i<arrLen;i++){
            testArray[i] = (int)((Math.random()*(ARRAY_MAX_ELEMENT_VALUE-ARRAY_MIN_ELEMENT_VALUE))+ARRAY_MIN_ELEMENT_VALUE);
        }
        return testArray;
    }
    @Test
    void sort_array() {
        for(int i = 0; i< TEST_ITERATIONS_QUANTITY;i++){
            int[] curr_test_array = generateArray();
            array_sort_class sorted_on_test = new array_sort_class(curr_test_array);
            Arrays.sort(curr_test_array);
            Assertions.assertEquals(curr_test_array, sorted_on_test.sort_array());
        }
    }
}