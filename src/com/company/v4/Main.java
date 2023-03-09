package com.company.v4;

import com.company.v4.input.CommandLineInput;
import com.company.v4.input.Input;
import com.company.v4.number_repository.FileNumberRepository;
import com.company.v4.number_repository.NumberRepository;
import com.company.v4.operations.AddOperation;
import com.company.v4.operations.AvgOperation;
import com.company.v4.operations.Operation;
import com.company.v4.output.CommandLineOutput;
import com.company.v4.output.Output;
import com.company.v4.operations.OperationFactory;


import java.io.IOException;

//Main class is the coordinator of the application
public class Main {

    public static void main(String[] args) throws IOException {

        //read the operator using commandline arguments
        Input input = new CommandLineInput();
        String operator = input.getOperator(args);

        //read the numbers from the text file/sql database/other files
        NumberRepository numberRepository =  new FileNumberRepository();
        int[] intNumbers = numberRepository.read();

        //using the factory design pattern to create the operation object
        OperationFactory operationFactory = new OperationFactory();  /*open-closed, single responsibility
                                                               principle violation was solved by
                                                           design patterns --> Factory design patterns */
        Operation operation = operationFactory.getInstance(operator);

        //perform the operation
        double result = 0;
        result = operation.perform(intNumbers);
        Output output = new CommandLineOutput();
        output.show("Result: " + result);
    }
}
