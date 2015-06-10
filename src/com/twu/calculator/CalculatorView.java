package com.twu.calculator;

import java.util.Scanner;

public class CalculatorView {

    private Scanner scanner;

    public void print(String data) {
        System.out.println(data);
    }

    public String read() {
        scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
