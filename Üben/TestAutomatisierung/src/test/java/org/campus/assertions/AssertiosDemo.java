package org.campus.assertions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AssertiosDemo {
    int a;
    String s;

    @BeforeEach
    void setUp() {
        a = 1;
        s = "Hallo Welt";
    }

    @Test
    @DisplayName("Test assertEquals")
    void assetEqualsTest() {
        int actual = 1;
        Assertions.assertEquals(a, actual);
    }

    @Test
    void assertTrueTest() {
        String halloWelt = "hallo welt";
        String lower = s.toLowerCase();

        Assertions.assertTrue(halloWelt.equals(lower));
        Assertions.assertTrue(a > 0);
    }


}



