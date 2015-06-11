package com.twu.calculator;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
    private double result;
    private Map<String, ArithmeticOperation> arithmeticOperationMap;
    private CalculatorView calculatorView;

    public Calculator(CalculatorView calculatorView, Map<String, ArithmeticOperation> arithmeticOperationMap) {
        this.calculatorView = calculatorView;
        this.arithmeticOperationMap = arithmeticOperationMap;
    }

    public void execute(String command, double operand) {
        ArithmeticOperation arithmeticOperation = arithmeticOperationMap.get(command);
        this.result = arithmeticOperation.execute(result, operand);
        calculatorView.print(result+"");
    }
}