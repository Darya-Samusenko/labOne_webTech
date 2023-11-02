package com.company.first_lab.Tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.util.Dictionary;
import java.util.Random;
import com.company.first_lab.Classes.tg_values_class;

class tg_values_classTest {

    private final int ITERATIONS_COUNT = 100;
    private final double STEP = 2;
    private boolean is_quite_close(double numOne, double numTwo){
        final double approximation = 0.0001;
        return (Math.abs(numOne-numTwo) < approximation);
    }
    @Test
    void get_values() {
        Random rand = new Random();
        tg_values_class curr_tg = new tg_values_class();
        for(int i =0; i<ITERATIONS_COUNT;i++){
            double left_border = rand.nextDouble();
            double right_border = rand.nextDouble();
            if(left_border > right_border){
                double temp = left_border;
                left_border = right_border;
                right_border = temp;
            }
            if(!is_quite_close(left_border, right_border)){
                double step = STEP;
                Dictionary<Double,Double> res = curr_tg.get_values(left_border,right_border,step);
                int j=0;
                for(double x = left_border; x< right_border; x = x + step){
                    Assertions.assertEquals(true, (j<res.size()));
                    Assertions.assertEquals(true, is_quite_close(res.elements().nextElement(),Math.tan(x)));
                    j++;
                }

            }
        }
    }
}