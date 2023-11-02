package com.company.first_lab.Classes;
import java.util.Dictionary;
import java.util.Hashtable;

public class tg_values_class {
    public Dictionary<Double, Double> get_values(double a, double b, double step){
        Dictionary<Double, Double> counted_values = new Hashtable<>();
        for(double curr_x = a; !(curr_x > b); curr_x = curr_x + step)
            counted_values.put(curr_x, Math.tan(curr_x));
        return counted_values;
    }
}
