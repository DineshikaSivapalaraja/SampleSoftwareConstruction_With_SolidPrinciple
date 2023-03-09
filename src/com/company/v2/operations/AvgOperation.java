package com.company.v2.operations;

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
