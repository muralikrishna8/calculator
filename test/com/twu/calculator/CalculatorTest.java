package com.twu.calculator;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
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
    @Mock
    private CalculatorView mockCalculatorView;
    @Mock
    private AbsoluteOperation mockAbsoluteOperation;
    @Mock
    private NegativeOperation mockNegativeOperation;
    @Mock
    private SquareOperation mockSquareOperation;
    @Mock
    private SquareRootOperation mockSquareRootOperation;


    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator(mockAddCommand, mockSubtractCommand,
                mockMultiplicationCommand, mockDivideCommand,
                mockCancelCommand, mockCalculatorView,
                mockAbsoluteOperation, mockNegativeOperation,
                mockSquareOperation, mockSquareRootOperation);
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
}