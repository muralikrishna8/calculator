package com.twu.calculator;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
    private double result;
    private Map<String, ArithmeticOperation> arithmeticOperationMap;
    private CalculatorView calculatorView;

    public Calculator(AddOperation addOperation, SubtractOperation subtractOperation,
                      MultiplyOperation multiplyOperation, DivideOperation divideOperation,
                      CancelOperation cancelOperation, CalculatorView calculatorView,
                      AbsoluteOperation absoluteOperation, NegativeOperation negativeOperation,
                      SquareOperation squareOperation, SquareRootOperation squareRootOperation,
                      CubeOperation cubeOperation, CubeRootOperation cubeRootOperation) {
        arithmeticOperationMap = new HashMap<>();
        arithmeticOperationMap.put("add", addOperation);
        arithmeticOperationMap.put("subtract", subtractOperation);
        arithmeticOperationMap.put("multiply", multiplyOperation);
        arithmeticOperationMap.put("divide", divideOperation);
        arithmeticOperationMap.put("cancel", cancelOperation);
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