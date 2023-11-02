package com.company.first_lab.Classes;

public class formula_class {
    public double calc(double x, double y){
        double res = 0;
        double arg1 = x;
        double arg2 = y;
        double mid_fraction = (2*arg1)/(1.0+arg1*arg1*arg2*arg2);
        res = (1.0+Math.sin(arg1+arg2)*Math.sin(arg1+arg2))/(2.0+Math.abs(arg1-mid_fraction))+arg1;
        return res;
    }
}
