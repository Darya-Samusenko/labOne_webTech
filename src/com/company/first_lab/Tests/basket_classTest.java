package com.company.first_lab.Tests;

import com.company.first_lab.Classes.task_nine.ball_class;
import com.company.first_lab.Classes.task_nine.ball_colors;
import com.company.first_lab.Classes.task_nine.basket_class;
import org.junit.jupiter.api.Test;

import  org.junit.jupiter.api.Assertions;

class basket_classTest {

    private basket_class basket;
    private void make_basket(){
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
        basket = new basket_class(basket_balls);
    }
    @Test
    void get_blue_balls_count() {
        make_basket();
        Assertions.assertEquals(10, basket.get_blue_balls_count());
    }

    @Test
    void get_summary_weight() {
        make_basket();
        Assertions.assertEquals(820, basket.get_summary_weight());
    }
}