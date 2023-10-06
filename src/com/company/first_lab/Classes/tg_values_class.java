package com.company.first_lab.Classes;
import java.util.Dictionary;
import java.util.Hashtable;

public class tg_values_class {
    private double a;
    private double b;
    private double step;
    public Dictionary<Double, Double> get_values(){
        Dictionary<Double, Double> counted_values = new Hashtable<>();
        for(double curr_x = a; !(curr_x > b); curr_x = curr_x + step)
            counted_values.put(curr_x, Math.tan(curr_x));
        return counted_values;
    }

    public tg_values_class(double num_one, double num_two, double num_three){
        this.a = num_one;
        this.b = num_two;
        this.step = num_three;
    }
}
