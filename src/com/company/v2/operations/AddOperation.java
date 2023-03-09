package com.company.v2.operations;

public class AddOperation implements Operation {
    //add all the numbers

    public double perform(int[] numbers){ //todo: change this name later
            double result = 0;

            for(int i=0; i<numbers.length; i++) {
                //for (int intNumber : intNumbers)
                result += numbers[i];
            }
  return result;
    }

}
