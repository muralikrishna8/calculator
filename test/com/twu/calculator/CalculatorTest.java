package com.twu.calculator;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorTest {
    @Mock
    private Add mockAdd;
    @Mock
    private Subtract mockSubtract;
    @Mock
    private Multiply mockMultiplicationCommand;
    @Mock
    private Divide mockDivide;
    @Mock
    private Cancel mockCancel;
    @Mock
    private CalculatorView mockCalculatorView;
    @Mock
    private Absolute mockAbsolute;
    @Mock
    private Negative mockNegative;
    @Mock
    private Square mockSquare;
    @Mock
    private SquareRoot mockSquareRoot;
    @Mock
    private Cube mockCube;
    @Mock
    private CubeRoot mockCubeRoot;


    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        Map<String, ArithmeticOperation> arithmeticOperationMap = new HashMap<>();
        arithmeticOperationMap.put("add", mockAdd);
        arithmeticOperationMap.put("subtract", mockSubtract);
        arithmeticOperationMap.put("multiply", mockMultiplicationCommand);
        arithmeticOperationMap.put("divide", mockDivide);
        arithmeticOperationMap.put("cancel", mockCancel);
        arithmeticOperationMap.put("abs", mockAbsolute);
        arithmeticOperationMap.put("neg", mockNegative);
        arithmeticOperationMap.put("sqr", mockSquare);
        arithmeticOperationMap.put("sqrt", mockSquareRoot);
        arithmeticOperationMap.put("cube", mockCube);
        arithmeticOperationMap.put("cubert", mockCubeRoot);
        calculator = new Calculator(mockCalculatorView, arithmeticOperationMap);
    }

    @Test
    public void shouldPerformAdditionOnAddCommand() {
        calculator.execute("add", 1.0);

        Mockito.verify(mockAdd).execute(0.0, 1.0);
    }

    @Test
    public void shouldPerformSubtractionOnSubtractCommand() {
        calculator.execute("subtract", 3.0);

        Mockito.verify(mockSubtract).execute(0.0, 3.0);
    }

    @Test
    public void shouldPerformMultiplicationOnMultiplyCommand() {
        calculator.execute("multiply", 3.0);

        Mockito.verify(mockMultiplicationCommand).execute(0.0, 3.0);
    }

    @Test
    public void shouldPerformDivisionOnDivideCommand() {
        calculator.execute("divide", 3.0);

        Mockito.verify(mockDivide).execute(0.0, 3.0);
    }
}