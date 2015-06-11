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
    private AddOperation mockAddOperation;
    @Mock
    private SubtractOperation mockSubtractOperation;
    @Mock
    private MultiplyOperation mockMultiplicationCommand;
    @Mock
    private DivideOperation mockDivideOperation;
    @Mock
    private CancelOperation mockCancelOperation;
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
    @Mock
    private CubeOperation mockCubeOperation;
    @Mock
    private CubeRootOperation mockCubeRootOperation;


    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator(mockAddOperation, mockSubtractOperation,
                mockMultiplicationCommand, mockDivideOperation,
                mockCancelOperation, mockCalculatorView,
                mockAbsoluteOperation, mockNegativeOperation,
                mockSquareOperation, mockSquareRootOperation,
                mockCubeOperation, mockCubeRootOperation);
    }

    @Test
    public void shouldPerformAdditionOnAddCommand() {
        calculator.execute("add", 1.0);

        Mockito.verify(mockAddOperation).execute(0.0, 1.0);
    }

    @Test
    public void shouldPerformSubtractionOnSubtractCommand() {
        calculator.execute("subtract", 3.0);

        Mockito.verify(mockSubtractOperation).execute(0.0, 3.0);
    }

    @Test
    public void shouldPerformMultiplicationOnMultiplyCommand() {
        calculator.execute("multiply", 3.0);

        Mockito.verify(mockMultiplicationCommand).execute(0.0, 3.0);
    }

    @Test
    public void shouldPerformDivisionOnDivideCommand() {
        calculator.execute("divide", 3.0);

        Mockito.verify(mockDivideOperation).execute(0.0, 3.0);
    }
}