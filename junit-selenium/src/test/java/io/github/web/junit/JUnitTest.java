package io.github.web.junit;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JUnitTest {

    @BeforeAll
    static void setupAll() {
        // Setup all tests
    }

    @BeforeEach
    void setup() {
        // Setup each test
    }

    @Test
    void test1() {
        // Exercise and verify
    }

    @Test
    void test2() {
        // Exercise and verify

        boolean booleanCondition = true;
        Object object1 = null;
        Object object2 = new Object();
        Object[] array1 = {};
        Object[] array2 = {};

        assertTrue(booleanCondition);
        assertFalse(!booleanCondition);

        assertArrayEquals(array1, array2);

        assertNull(object1);
        assertNotNull(object2);
    }

    @AfterEach
    void teardown() {
        // teardown each test
    }

    @AfterAll
    static void teardownAll() {
        // teardown all tests
    }

}
