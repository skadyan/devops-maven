package com.lloydsbanking.salsa.loans.common;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@Tag("slow")
public class SimpleExampleTest {

    @Test
    void myFirstTest() {
        assertEquals(2, 1 + 1);
    }

    @ParameterizedTest
    @ValueSource(strings = { "Hello", "World" })
    void testWithStringParameter(String argument) {
        assertNotNull(argument);
    }

    @Test
    void testEnsureEndsWith() throws Exception {
        String expected = "/salsa/services/";
        String actual = StringUtils.ensureEndsWith("/salsa/services", '/');
        assertEquals(expected, actual);
    }

}
