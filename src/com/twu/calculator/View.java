package com.twu.calculator;

import java.util.Scanner;

public class View {

    private Scanner scanner;

    public View(Scanner scanner){
        this.scanner = scanner;
    }

    public void print(String data) {
        System.out.println(data);
    }

    public String read() {
        return scanner.nextLine();
    }
}
