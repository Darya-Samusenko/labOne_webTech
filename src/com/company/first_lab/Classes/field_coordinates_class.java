package com.company.first_lab.Classes;

public class field_coordinates_class {
    //точки-границы фигуры: {{-6,-3},{-6,0},{-4,0},{-4,5},{4,5},{4,0},{6,0},{6,-3}}
    //т.к. фигура симметричная, то достаточно проверить: {{6,-3},{6,0},{4,0},{4,5}}
    private final int[] checkpoints = {6,4,-3,5,0};
    private int[] compared_point;
    public boolean is_inside(){
        boolean is_inside = true;
        if(Math.abs(this.compared_point[0]) > checkpoints[0])
            is_inside = false;
        else {
            if ((Math.abs(this.compared_point[1]) < checkpoints[2]) || (Math.abs(this.compared_point[1]) > checkpoints[3]))
                is_inside = false;
            else {
                if ((Math.abs(this.compared_point[0]) > checkpoints[1]) && (Math.abs(this.compared_point[1]) > checkpoints[4]))
                    is_inside = false;
            }
        }
        return is_inside;
    }
    public field_coordinates_class(int x, int y){
        this.compared_point = new int[2];
        this.compared_point[0] = x;
        this.compared_point[1] = y;
    }

}
