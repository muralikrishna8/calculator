package com.twu.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class AbsoluteTest {

    @Test
    public void shouldDivideTwoOperands() throws Exception {
        Absolute absolute = new Absolute();

        double actualAccumulator = absolute.execute(-6.0, 0.0);

        assertThat(actualAccumulator, is(6.0));
    }
}