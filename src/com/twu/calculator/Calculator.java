package com.twu.calculator;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
    private double result;
    private Map<String, Executable> commandActionMap;

    public Calculator(AddCommand addCommand, SubtractCommand subtractCommand,
                      MultiplyCommand multiplyCommand, DivideCommand divideCommand,
                      CancelCommand cancelCommand) {
        commandActionMap = new HashMap<>();
        commandActionMap.put("add", addCommand);
        commandActionMap.put("subtract", subtractCommand);
        commandActionMap.put("multiply", multiplyCommand);
        commandActionMap.put("divide", divideCommand);
        commandActionMap.put("cancel", cancelCommand);
    }

    public void execute(String command, double operand) {
        Executable executable = commandActionMap.get(command);
        this.result = executable.execute(result, operand);
    }

    public void execute(String command) {
        Executable executable = commandActionMap.get(command);
        this.result = executable.execute(0.0, 0.0);
    }
}