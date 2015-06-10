package com.twu.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SquareOperationTest {
    @Test
    public void shouldDivideTwoOperands() throws Exception {
        SquareOperation squareOperation = new SquareOperation();

        double actualAccumulator = squareOperation.execute(6.0, 2.0);

        assertThat(actualAccumulator, is(36.0));
    }
}