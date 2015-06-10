package com.twu.calculator;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
    private double result;
    private Map<String, ArithmeticOperation> arithmeticOperationMap;
    private CalculatorView calculatorView;

    public Calculator(AddCommand addCommand, SubtractCommand subtractCommand,
                      MultiplyCommand multiplyCommand, DivideCommand divideCommand,
                      CancelCommand cancelCommand, CalculatorView calculatorView) {
        arithmeticOperationMap = new HashMap<>();
        arithmeticOperationMap.put("add", addCommand);
        arithmeticOperationMap.put("subtract", subtractCommand);
        arithmeticOperationMap.put("multiply", multiplyCommand);
        arithmeticOperationMap.put("divide", divideCommand);
        arithmeticOperationMap.put("cancel", cancelCommand);

        this.calculatorView = calculatorView;
    }

    public void execute(String command, double operand) {
        ArithmeticOperation arithmeticOperation = arithmeticOperationMap.get(command);
        this.result = arithmeticOperation.execute(result, operand);
        calculatorView.print(result+"");
    }
}