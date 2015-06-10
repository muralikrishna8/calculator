package com.twu.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class AbsoluteOperationTest {

    @Test
    public void shouldDivideTwoOperands() throws Exception {
        AbsoluteOperation absoluteOperation = new AbsoluteOperation();

        double actualAccumulator = absoluteOperation.execute(-6.0, 0.0);

        assertThat(actualAccumulator, is(6.0));
    }
}