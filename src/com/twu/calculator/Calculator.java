package com.twu.calculator;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
    private double result;
    private Map<String, Executable> commandActionMap;

    public Calculator(AddCommand addCommand) {
        commandActionMap = new HashMap<>();
        commandActionMap.put("add", addCommand);
    }

    public void execute(String command, double operand) {
        Executable executable = commandActionMap.get(command);
        this.result = executable.execute();
    }
}
