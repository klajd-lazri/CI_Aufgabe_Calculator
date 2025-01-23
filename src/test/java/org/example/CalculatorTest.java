package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        //Jedes mal, das ich die Klasse calculator verwende und teste, wird eine neue Instanz erstellt
        calculator = new Calculator();
    }

    @Test
    void add() {
        //Erste Zahl: Was ist das Ziel/Ergebnis?
        assertEquals(7, calculator.add(3,4));
        //Was ist nicht das Ziel?
        assertNotEquals(9, calculator.add(5,5));
    }


    @Test
    void substract() {
        assertEquals(3, calculator.substract(6,3));
        assertNotEquals(6, calculator.substract(5,5));
    }


    @Test
    void multiply() {
        assertEquals(10, calculator.multiply(2,5));
        assertNotEquals(4, calculator.multiply(5,5));
    }


    @Test
    void divide() {
        assertEquals(5, calculator.divide(5,1));
        assertNotEquals(11, calculator.divide(100,10));

        assertThrows(IllegalArgumentException.class, () -> calculator.divide(12, 0));
    }


    @Test
    void squareroot() {
        assertEquals(5, calculator.squareroot(25));
    }

     @Test
    void square() {
        assertEquals(25, calculator.square(5));
    }

}