package com.company.first_lab.Tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.company.first_lab.Classes.make_matrix_class;
import static org.junit.jupiter.api.Assertions.*;

class make_matrix_classTest {

    private final int LEN_OF_ARR = 5;
    private final int[][] test_arr = {
            {1,2,3,4},
            {4,5,3},
            {2,3},
            {10,14,2,3,4,5,6,7},
            {7,5,6,8,4,4,5},
    };
    private int[][][] test_matrix = {
            {
                    {1,2,3,4},
                    {2,3,4,1},
                    {3,4,1,2},
                    {4,1,2,3},
            },
            {
                    {4,5,3},
                    {5,3,4},
                    {3,4,5},
            },
            {
                    {2,3},
                    {3,2},
            },
            {
                    {10,14,2,3,4,5,6,7},
                    {14,2,3,4,5,6,7,10},
                    {2,3,4,5,6,7,10,14},
                    {3,4,5,6,7,10,14,2},
                    {4,5,6,7,10,14,2,3},
                    {5,6,7,10,14,2,3,4},
                    {6,7,10,14,2,3,4,5},
                    {7,10,14,2,3,4,5,6},
            },
            {
                    {7,5,6,8,4,4,5},
                    {5,6,8,4,4,5,7},
                    {6,8,4,4,5,7,5},
                    {8,4,4,5,7,5,6},
                    {4,4,5,7,5,6,8},
                    {4,5,7,5,6,8,4},
                    {5,7,5,6,8,4,4},
            },
    };

    private boolean are_same(int[][] one, int[][] two){
        boolean are_equal = true;
        for(int i=0;(i<one.length)&&(are_equal);i++){
            for(int j=0;(j<one[i].length)&&(are_equal);j++)
                are_equal = one[i][j]==two[i][j];
        }
        return are_equal;
    }
    @Test
    void transform_to_matrix() {
        make_matrix_class maker = new make_matrix_class();
        for(int i=0;i<LEN_OF_ARR;i++){
            int[][] res = maker.transform_to_matrix(test_arr[i]);
            Assertions.assertEquals(true, are_same(test_matrix[i], res));
        }
    }
}