package com.company.first_lab.Classes;
import java.util.ArrayList;

public class primes_in_array_class {
    private boolean is_prime(int num){
        boolean is_prime_num = true;
        if(num < 2)
            is_prime_num = false;
        for(int i = 2; (i < num)&&(is_prime_num); i++)
            is_prime_num = ((num % i)!=0);
        return is_prime_num;
    }
    public ArrayList<Integer> find_all_primes(int[] all_numbers){
        int n = all_numbers.length;
        ArrayList<Integer> prime_positions = new ArrayList<>();
        for( int i=0; i<n;i++){
            if(is_prime(all_numbers[i]))
                prime_positions.add(i);
        }
        return prime_positions;
    }
}
