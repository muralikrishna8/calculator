package com.twu.calculator;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
    private double result;
    private Map<String, ArithmeticOperation> arithmeticOperationMap;
    private CalculatorView calculatorView;

    public Calculator(AddCommand addCommand, SubtractCommand subtractCommand,
                      MultiplyCommand multiplyCommand, DivideCommand divideCommand,
                      CancelCommand cancelCommand, CalculatorView calculatorView,
                      AbsoluteOperation absoluteOperation, NegativeOperation negativeOperation,
                      SquareOperation squareOperation, SquareRootOperation squareRootOperation,
                      CubeOperation cubeOperation, CubeRootOperation cubeRootOperation) {
        arithmeticOperationMap = new HashMap<>();
        arithmeticOperationMap.put("add", addCommand);
        arithmeticOperationMap.put("subtract", subtractCommand);
        arithmeticOperationMap.put("multiply", multiplyCommand);
        arithmeticOperationMap.put("divide", divideCommand);
        arithmeticOperationMap.put("cancel", cancelCommand);
        arithmeticOperationMap.put("abs", absoluteOperation);
        arithmeticOperationMap.put("neg", negativeOperation);
        arithmeticOperationMap.put("sqr", squareOperation);
        arithmeticOperationMap.put("sqrt", squareRootOperation);
        arithmeticOperationMap.put("cube", cubeOperation);
        arithmeticOperationMap.put("cubert", cubeRootOperation);

        this.calculatorView = calculatorView;
    }

    public void execute(String command, double operand) {
        ArithmeticOperation arithmeticOperation = arithmeticOperationMap.get(command);
        this.result = arithmeticOperation.execute(result, operand);
        calculatorView.print(result+"");
    }
}