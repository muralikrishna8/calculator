package com.twu.calculator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EntryPoint {
    public static void main(String[] args) {
        View view = new View(new Scanner(System.in));


        Map<String, ArithmeticOperation> operations = initialiseOperations();

        Model model = new Model(view, operations);

        App app = new App(model, view, new ArrayList<String>());
        app.start();
    }

    private static Map<String, ArithmeticOperation> initialiseOperations() {
        Map<String, ArithmeticOperation> operations = new HashMap<String, ArithmeticOperation>();
        operations.put("cancel", new Cancel());
        return operations;
    }
}