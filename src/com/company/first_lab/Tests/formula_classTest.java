package com.company.first_lab.Tests;

import com.company.first_lab.Classes.formula_class;
import org.junit.jupiter.api.Assertions;


class formula_classTest {
    private final double[] correct_results = {1.392275, 2.417762, 4.195624, 5.286165, 8.198268};
    private final int[][] test_numbers = {{1,2},{2,2},{4,5},{5,6},{8,6}};
    private boolean is_quite_close(double numOne, double numTwo){
        final double approximation = 0.0001;
        return (Math.abs(numOne-numTwo) < approximation);
    }
    @org.junit.jupiter.api.Test
    void calc() {

        for( int test_it = 0; test_it < 1000; test_it++)
            for( int i =0; i< test_numbers.length;i++){
                formula_class test_formula = new formula_class();
                double res = test_formula.calc(test_numbers[i][0],test_numbers[i][1]);
                Assertions.assertEquals(true, is_quite_close(correct_results[i], res));
            }
    }
}