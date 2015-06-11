package com.twu.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CubeTest {
    @Test
    public void shouldDivideTwoOperands() throws Exception {
        Cube cube = new Cube();

        double actualAccumulator = cube.execute(4.0, 0.0);

        assertThat(actualAccumulator, is(64.0));
    }
}