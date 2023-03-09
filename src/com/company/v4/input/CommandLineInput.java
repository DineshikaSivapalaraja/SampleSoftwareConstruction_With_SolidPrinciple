package com.company.v4.input;

public class CommandLineInput implements Input{

    public String getOperator(String[] args){ //todo: move args to constructor
        return args[0];
    }
}
