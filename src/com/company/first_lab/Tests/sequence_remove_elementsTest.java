package com.company.first_lab.Tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.company.first_lab.Classes.sequence_remove_elements;
import static org.junit.jupiter.api.Assertions.*;

class sequence_remove_elementsTest {

    private final int[][] test_sequences={
            {2,4,6,7,8,9},
            {2,6,7,5,8,6,9,13,14,2,35}
    };
    private final int[] required_answers={0,3};
    @Test
    void find_quantity_of_elements_to_remove() {
        sequence_remove_elements remove_counter = new sequence_remove_elements();
        for(int i=0;i<required_answers.length;i++){
            int res = remove_counter.find_quantity_of_elements_to_remove(test_sequences[i]);
            Assertions.assertEquals(required_answers[i], remove_counter.find_quantity_of_elements_to_remove(test_sequences[i]));
        }

    }
}