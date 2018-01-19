package com.jjhellberg;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogicTest {
    private final String INPUT = "aa bb cc dd\n" +
            "aa bb cc aa\n" +
            "aa bb cc aaa";

    Logic logic = new Logic();

    @Test
    public void testInputSize() {
        assertEquals(3, logic.organizeInput(INPUT).size());
    }

    @Test
    public void testLastRow() {
        assertEquals("[aa, bb, cc, aaa]", logic.organizeInput(INPUT).get(2).toString());
    }


    @Test
    public void testInput() {
        assertEquals(2, logic.countValidRows(INPUT));
    }
}