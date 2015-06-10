package com.twu.calculator;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorTest {
    @Mock
    private AddCommand mockAddCommand;
    @Mock
    private SubtractCommand mockSubtractCommand;
    @Mock
    private MultiplyCommand mockMultiplicationCommand;
    @Mock
    private DivideCommand mockDivideCommand;
    @Mock
    private CancelCommand mockCancelCommand;


    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator(mockAddCommand, mockSubtractCommand,
                mockMultiplicationCommand, mockDivideCommand, mockCancelCommand);
    }

    @Test
    public void shouldPerformAdditionOnAddCommand() {
        calculator.execute("add", 1.0);

        Mockito.verify(mockAddCommand).execute(0.0, 1.0);
    }

    @Test
    public void shouldPerformSubtractionOnSubtractCommand() {
        calculator.execute("subtract", 3.0);

        Mockito.verify(mockSubtractCommand).execute(0.0, 3.0);
    }

    @Test
    public void shouldPerformMultiplicationOnMultiplyCommand() {
        calculator.execute("multiply", 3.0);

        Mockito.verify(mockMultiplicationCommand).execute(0.0, 3.0);
    }

    @Test
    public void shouldPerformDivisionOnDivideCommand() {
        calculator.execute("divide", 3.0);

        Mockito.verify(mockDivideCommand).execute(0.0, 3.0);
    }

    @Test
    public void shouldPerformResetOnCancelCommand() {
        calculator.execute("cancel");

        Mockito.verify(mockCancelCommand).execute(0.0, 0.0);
    }
}