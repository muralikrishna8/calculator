package com.twu.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class NegativeOperationTest {
    @Test
    public void shouldNegateTheAccumulator() {
        NegativeOperation negativeOperation = new NegativeOperation();

        double actualAccumulator = negativeOperation.execute(6.0, 0.0);

        assertThat(actualAccumulator, is(-6.0));
    }
}