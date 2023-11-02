package com.company.first_lab.Tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class field_coordinates_classTest {

    private final int[][] test_inside_points = {{0,0},{1,1},{2,2},{3,3},{4,4},{-1,1},{-2,2},{-3,3},{-4,4},{-1,-1},{1,-1},{5,-1},{-5,-1},{0,-3}};
    private final int[][] test_outside_points = {{10,10},{5,1},{-5,3},{6,1},{0,6},{4,6},{-6,1},{17,6},{34,155},{2,-5}};
    @Test
    void is_inside() {
        for( int i = 0; i< test_inside_points.length;i++){

        }
    }
}