package com.twu.calculator;

import org.junit.Assert;
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
public class ModelTest {
    @Mock
    private Cancel mockCancel;
    @Mock
    private View mockView;
    @Mock
    private Absolute mockAbsolute;
    @Mock
    private Negative mockNegative;
    @Mock
    private SquareRoot mockSquareRoot;
    @Mock
    private Cube mockCube;
    @Mock
    private CubeRoot mockCubeRoot;


    private Model model;

    @Before
    public void setUp(){
        Map<String, ArithmeticOperation> arithmeticOperationMap = new HashMap<>();
        arithmeticOperationMap.put("cancel", mockCancel);
        arithmeticOperationMap.put("abs", mockAbsolute);
        arithmeticOperationMap.put("neg", mockNegative);
        arithmeticOperationMap.put("sqrt", mockSquareRoot);
        arithmeticOperationMap.put("cube", mockCube);
        arithmeticOperationMap.put("cubert", mockCubeRoot);
        model = new Model(mockView, arithmeticOperationMap);
    }

    @Test
    public void shouldAddTwoOperands(){
        double actualTotal = model.add(4);

        Assert.assertThat(actualTotal, is(4.0));
    }

    @Test
    public void shouldSubtractTwoOperands(){
        double actualTotal = model.subtract(4);

        Assert.assertThat(actualTotal, is(-4.0));
    }
    @Test
    public void shouldMultiplyTwoOperands(){
        model.add(4);
        double actualTotal = model.multiply(4);

        Assert.assertThat(actualTotal, is(16.0));
    }
    
    @Test
    public void shouldDivideTwoOperands(){
        model.add(4);
        double actualTotal = model.divide(4);

        Assert.assertThat(actualTotal, is(1.0));
    }

    @Test
    public void shouldComputeSquare(){
        model.add(4);
        double actualTotal = model.square();

        Assert.assertThat(actualTotal, is(16.0));
    }

    @Test
    public void shouldGiveTheFormattedAccumulator() {
        String actualAccumulator = model.formattedAccumulator();

        assertThat(actualAccumulator, is("0.0"));
    }
}