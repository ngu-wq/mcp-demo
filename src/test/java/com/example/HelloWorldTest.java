package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit tests for HelloWorld class.
 */
class HelloWorldTest {

    @Test
    void testGetGreeting() {
        HelloWorld app = new HelloWorld();
        assertEquals("Hello, World!", app.getGreeting());
    }
}
