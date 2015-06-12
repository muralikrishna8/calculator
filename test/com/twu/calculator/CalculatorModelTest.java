package com.twu.calculator;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorModelTest {
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


    private CalculatorModel calculatorModel;

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
        calculatorModel = new CalculatorModel(mockCalculatorView, arithmeticOperationMap);
    }

    @Test
    public void shouldPerformAdditionOnAddCommand() {
        calculatorModel.execute("add", 1.0);

        Mockito.verify(mockAdd).execute(0.0, 1.0);
    }

    @Test
    public void shouldPerformSubtractionOnSubtractCommand() {
        calculatorModel.execute("subtract", 3.0);

        Mockito.verify(mockSubtract).execute(0.0, 3.0);
    }

    @Test
    public void shouldPerformMultiplicationOnMultiplyCommand() {
        calculatorModel.execute("multiply", 3.0);

        Mockito.verify(mockMultiplicationCommand).execute(0.0, 3.0);
    }

    @Test
    public void shouldPerformDivisionOnDivideCommand() {
        calculatorModel.execute("divide", 3.0);

        Mockito.verify(mockDivide).execute(0.0, 3.0);
    }

    @Test
    public void shouldGiveTheFormattedAccumulator() {
        String actualAccumulator = calculatorModel.formattedAccumulator();

        assertThat(actualAccumulator, is("0.0"));
    }
}