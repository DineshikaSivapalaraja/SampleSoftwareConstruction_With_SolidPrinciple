package com.company.v3;

import com.company.v3.input.CommandLineInput;
import com.company.v3.input.Input;
import com.company.v3.number_repository.FileNumberRepository;
import com.company.v3.number_repository.NumberRepository;
import com.company.v3.operations.AddOperation;
import com.company.v3.operations.AvgOperation;
import com.company.v3.operations.Operation;
import com.company.v3.output.CommandLineOutput;
import com.company.v3.output.Output;

import java.io.IOException;

public class Main {

    //The Dependency inversion principle is violated 
    public static void main(String[] args) throws IOException {

        //read the operator using commandline arguments
        Input input = new CommandLineInput();   //CommandLineInput commandLineInput = new CommandLineInput(); //tight coupling
        String operator = input.getOperator(args);

        //read the numbers from the text file/ sql database
        NumberRepository numberRepository = new FileNumberRepository();
        //FileNumberRepository numberRepository = new FileNumberRepository(); //Dependency inversion principle violated
        int[] intNumbers = numberRepository.read();

        //perform the operation
        double result = 0;//this code lines violates single responsibility & open-closed principle //version 4 has solution
        Operation operation = null;
        if (operator.equals("+")) {
            operation = new AddOperation();
        }
        else if(operator.equals("avg")){
            operation = new AvgOperation();
        }

        result = operation.perform(intNumbers);
        //show output to the user

        // CommandLineOutput commandLineOutput = new CommandLineOutput();
        // this line violating dependency inversion principle
        //commandLineOutput.show("Result: "+result);

        Output output = new CommandLineOutput();
        output.show("Result: " + result);
    }
}
