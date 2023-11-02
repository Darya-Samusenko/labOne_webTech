package com.company.first_lab.Classes.task_nine;

import com.company.first_lab.Classes.task_nine.ball_colors;
public class ball_class {
    private int weight;
    private ball_colors color;
    public int getWeight(){
        return this.weight;
    }

    public ball_colors getColor(){
        return this.color;
    }

    public ball_class(int weight, ball_colors clr){
        this.color = clr;
        this.weight = weight;
    }
}
