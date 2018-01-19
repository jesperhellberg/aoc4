package com.jjhellberg;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogicTest {
    private final String INPUT = "aa bb cc dd\n" +
            "aa bb cc aa\n" +
            "aa bb cc aaa";

    private final String INPUT2 = "abcde fghij\n" +
            "abcde xyz ecdab\n" +
            "a ab abc abd abf abj\n" +
            "iiii oiii ooii oooi oooo\n" +
            "oiii ioii iioi iiio";

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

    @Test
    public void testAnagram2() {
        assertEquals(0, logic.countNoAnagrams("abcde xyz ecdab"));
    }

    @Test
    public void testAnagram4() {
        assertEquals(1, logic.countNoAnagrams("iiii oiii ooii oooi oooo"));
    }

    @Test
    public void testAnagrams() {
        assertEquals(3, logic.countNoAnagrams(INPUT2));
    }

}