package com.company.v1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    //single responsibility principle-violate
    //open-closed principle-violate

    public static void main(String[] args) throws IOException {
        System.out.println("Hello World!");
        //read the operator using commandline arguments
        String operator = args[0]; // System.out.println("operator is " + operator);
                               /*how to run this statement without error go
                        main-->edit configuration-->CLI arguments(ALT+R) put operators(+,-,*)  */

        //read the numbers from the text file
        List<String> lines =  Files.readAllLines(Paths.get("C:\\Users\\Haridinu\\IdeaProjects\\Software_Construction\\src\\com\\company\\numbers.txt"));
        String firstLine = lines.get(0);
        //split first line by comma
        String[] numbers = firstLine.split(",");
        //but don't use this kind of standard method it provides harm

     //convert this String array to Integer array
        int []  intNumbers = new int[numbers.length];
        for(int i=0; i<numbers.length; i++) {
            intNumbers[i] = Integer.parseInt(numbers[i]);

        }

        //perform the operation
        double result = 0;
        if (operator.equals("+")){
            //add all the numbers
            for(int i=0; i<intNumbers.length; i++) {
                //for (int intNumber : intNumbers)
                result += intNumbers[i];
            }
        }
        else if(operator.equals("avg")){
            //calculate the average
            for(int i=0; i<intNumbers.length; i++) {
                result += intNumbers[i];
            }
            result = result/intNumbers.length;
        }
        //show output to the user
        System.out.println("Result: " + result);
    }
}
