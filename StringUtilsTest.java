package com.example.utils;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    private StringUtils utils;

    @BeforeEach
    void setUp() {
        utils = new StringUtils();
    }

    @ParameterizedTest
    @CsvSource({
        "madam, true",
        "racecar, true",
        "hello, false",
        "'', true"
    })
    void testIsPalindrome(String input, boolean expected) {
        assertEquals(expected, utils.isPalindrome(input));
    }

    @Test
    void testReverse() {
        assertEquals("olleh", utils.reverse("hello"));
    }

    @Test
    void testIsBlank() {
        assertTrue(utils.isBlank(null));
        assertTrue(utils.isBlank("   "));
        assertFalse(utils.isBlank("hi"));
    }
}
