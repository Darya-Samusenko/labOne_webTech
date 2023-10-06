package com.company.first_lab;

import com.company.first_lab.Classes.*;

public class Main {

    public static int[] tenth_task_solution(){
        final int balls_quantity = 40;
        ball_class[] basket_balls = new ball_class[balls_quantity];
        for(int i =0; i< balls_quantity;i++){

            ball_colors curr_color = ball_colors.RED;
            switch(i%4){
                case 0:
                    curr_color = ball_colors.BLUE;
                    break;
                case 1:
                    curr_color = ball_colors.GREEN;
                    break;
                case 2:
                    curr_color = ball_colors.RED;
                    break;
                case 3:
                    curr_color = ball_colors.YELLOW;
                    break;
            }
            basket_balls[i] = new ball_class(i+1,curr_color);
        }
        basket_class basket = new basket_class(basket_balls);
        int[] results = new int[2];
        results[0] = basket.get_blue_balls_count();
        results[1] = basket.get_summary_weight();
        System.out.println("Count of blue balls in basket: "+results[0]+"\r\nCommon weight of balls: "+results[1]);
        return results;
    }
    public static void main(String[] args) {
        tenth_task_solution();
    }
}
