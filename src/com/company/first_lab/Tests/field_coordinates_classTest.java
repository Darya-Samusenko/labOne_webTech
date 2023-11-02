package com.company.first_lab.Tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.company.first_lab.Classes.field_coordinates_class;
import static org.junit.jupiter.api.Assertions.*;

class field_coordinates_classTest {

    private final int[][] test_inside_points = {{0,0},{1,1},{2,2},{3,3},{4,4},{-1,1},{-2,2},{-3,3},{-4,4},{-1,-1},{1,-1},{5,-1},{-5,-1},{0,-3}};
    private final int[][] test_outside_points = {{10,10},{5,1},{-5,3},{6,1},{0,6},{4,6},{-6,1},{17,6},{34,155},{2,-5}};
    @Test
    void is_inside() {
        field_coordinates_class curr = new field_coordinates_class();
        for( int i = 0; i< test_inside_points.length;i++){
            Assertions.assertEquals(true, curr.is_inside(test_inside_points[i][0], test_inside_points[i][1]));
        }
        for( int i = 0; i< test_outside_points.length;i++){
            Assertions.assertEquals(false, curr.is_inside(test_outside_points[i][0], test_outside_points[i][1]));
        }
    }
}