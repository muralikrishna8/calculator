package com.twu.calculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CalculatorViewTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private ByteArrayInputStream byteArrayInputStream;

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldPrintTheResult() {
        CalculatorView calculatorView = new CalculatorView(new Scanner(System.in));
        calculatorView.print("5");

        assertEquals("5\n", outContent.toString());
    }

    @Test
    public void shouldReadUserInput() {
        String input = "add 1";
        byteArrayInputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(byteArrayInputStream);
        CalculatorView calculatorView = new CalculatorView(new Scanner(System.in));

        String actualInput = calculatorView.read();

        assertThat(actualInput, is("add 1"));
    }

    @After
    public void tearDown() {
        System.setOut(null);
    }
}