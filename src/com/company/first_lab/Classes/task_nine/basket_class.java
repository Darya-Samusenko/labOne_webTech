package com.company.first_lab.Classes.task_nine;

import com.company.first_lab.Classes.task_nine.ball_class;
import com.company.first_lab.Classes.task_nine.ball_colors;

import java.util.ArrayList;
import java.util.List;
public class basket_class {
    private List<ball_class> balls;

    public int get_blue_balls_count(){
        int blue_balls_count = 0;
        for (ball_class curr_ball:balls) {
            if(curr_ball.getColor() == ball_colors.BLUE)
                blue_balls_count++;
        }
        return blue_balls_count;
    }
    public int get_summary_weight(){
        int res_weight = 0;
        for (ball_class curr_ball:balls) {
            res_weight += curr_ball.getWeight();
        }
        return res_weight;
    }


    public void add_ball(ball_class new_ball){
        this.balls.add(new_ball);
    }
    public void add_ball(ball_class[] new_balls){
        for( int i=0;i<new_balls.length;i++)
            this.balls.add(new_balls[i]);
    }
    public void add_ball(List<ball_class> new_balls){
        this.balls.addAll(new_balls);
    }

    public basket_class(){
        this.balls = new ArrayList<ball_class>();
    }
    public basket_class(ball_class first_ball){
        this.balls = new ArrayList<ball_class>();
        this.add_ball(first_ball);
    }
    public basket_class(ball_class[] balls){
        this.balls = new ArrayList<ball_class>();
        this.add_ball(balls);
    }
    public basket_class(List<ball_class> balls){
        this.balls = new ArrayList<ball_class>();
        this.add_ball(balls);
    }
}
