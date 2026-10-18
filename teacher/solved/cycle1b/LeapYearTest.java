package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LeapYearTest {

    @Test
    void 西暦2024年はうるう年() {
        assertTrue(LeapYear.isLeapYear(2024));
    }

    @Test
    void 西暦2023年はうるう年ではない() {
        assertFalse(LeapYear.isLeapYear(2023));
    }
}
