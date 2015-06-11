package com.twu.calculator;

import java.util.Scanner;

public class CalculatorView {

    private Scanner scanner;

    public CalculatorView(Scanner scanner){
        this.scanner = scanner;
    }

    public void print(String data) {
        System.out.println(data);
    }

    public String read() {
        return scanner.nextLine();
    }
}
