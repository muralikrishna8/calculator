package com.twu.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SquareRootTest {
    @Test
    public void shouldDivideTwoOperands() throws Exception {
       SquareRoot squareRoot = new SquareRoot();

        double actualAccumulator = squareRoot.execute(16.0, 0.0);

        assertThat(actualAccumulator, is(4.0));
    }
}