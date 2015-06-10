package com.twu.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SquareRootOperationTest {
    @Test
    public void shouldDivideTwoOperands() throws Exception {
       SquareRootOperation squareRootOperation = new SquareRootOperation();

        double actualAccumulator = squareRootOperation.execute(16.0, 0.0);

        assertThat(actualAccumulator, is(4.0));
    }
}