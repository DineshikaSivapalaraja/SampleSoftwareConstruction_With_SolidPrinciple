package com.company.v4.operations;

import com.company.v4.operations.Operation;

public class AvgOperation implements Operation {
    //calculate the average
     public double perform (int[] numbers){ //todo: change this name later
            double result = 0;
            for(int i=0; i<numbers.length; i++) {
                result += numbers[i];
             }
            result = result/numbers.length;
            return result;
}
}
