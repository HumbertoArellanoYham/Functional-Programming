package com.arellano.lambda;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunctionalProgrammingTest {
    @Test
    void longitudStringTest(){
        FunctionalProgramming function = new FunctionalProgramming();

        String test = "Lambda";
        Integer result = function.caracteres(test);

        assertEquals(6, result);
    }
}