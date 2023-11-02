package com.company.first_lab.Classes;

public class field_coordinates_class {
    //точки-границы фигуры: {{-6,-3},{-6,0},{-4,0},{-4,5},{4,5},{4,0},{6,0},{6,-3}}
    //т.к. фигура симметричная, то достаточно проверить: {{6,-3},{6,0},{4,0},{4,5}}
    private final int[] checkpoints = {6,4,-3,5,0};
    public boolean is_inside(int x, int y){
        boolean is_inside = true;
        if(Math.abs(x) > checkpoints[0])
            is_inside = false;
        else {
            if ((y < checkpoints[2]) || (y > checkpoints[3]))
                is_inside = false;
            else {
                if ((Math.abs(x) > checkpoints[1]) && (y > checkpoints[4]))
                    is_inside = false;
            }
        }
        return is_inside;
    }
    public field_coordinates_class(){
    }

}
