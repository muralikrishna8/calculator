package com.twu.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class NegativeTest {
    @Test
    public void shouldNegateTheAccumulator() {
        Negative negative = new Negative();

        double actualAccumulator = negative.execute(6.0, 0.0);

        assertThat(actualAccumulator, is(-6.0));
    }
}