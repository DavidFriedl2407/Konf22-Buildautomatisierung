package org.campus02.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTestTest {
    @Test
    void add() {
        int result=  Calculator.add(2,2);
        //erwartetes ergebnis
        int erwartet= 4;

        //versifizieren step3
        Assertions.assertEquals(erwartet, result);
    }

    @Test
    void subract() {
        int result = Calculator.subract(4,2);
        // erwartetes ergebnis
        int erwartet = 2;
        Assertions.assertEquals(erwartet, result);
    }

    @Test
    void multiply() {
        int result = Calculator.multiply(4,2);
        // erwartetes ergebnis
        int erwartet = 8;
        Assertions.assertEquals(erwartet, result);

}}