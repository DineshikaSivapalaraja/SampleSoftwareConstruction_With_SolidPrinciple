package com.company.v4.operations;

public class OperationFactory {
    public Operation getInstance(String operator){
        Operation operation = null;
        if (operator.equals("+")) {
            operation = new AddOperation();
        }
        else if(operator.equals("avg")){
            operation = new AvgOperation();
        }
        return operation;
    }

}
