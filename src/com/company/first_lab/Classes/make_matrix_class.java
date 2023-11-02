package com.company.first_lab.Classes;

public class make_matrix_class {
    public int[][] transform_to_matrix(int[] arr){
        int len = arr.length;
        int[][] result_matrix = new int[len][len];
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++)
                result_matrix[i][j] = arr[(j+i)%len];
        }
        return result_matrix;
    }
}
