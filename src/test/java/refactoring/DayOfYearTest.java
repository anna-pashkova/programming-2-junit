package refactoring;

import org.junit.jupiter.api.Test; 
import static org.junit.jupiter.api.Assertions.assertEquals; 
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DayOfYearTest {
    
    @Test
    public void testFirstDayOfYear() {
        assertEquals(1, DayOfYear.dayOfYear(1, 1, 2023));
}

    @Test
    public void testEndOfYear() {
        assertEquals(365, DayOfYear.dayOfYear(12, 31, 2023));
}

    @Test
    public void testMiddleOfYear() {
        assertEquals(172, DayOfYear.dayOfYear(6, 21, 2023));
}

    @Test
    public void testLeapYearFebruary() {
        assertEquals(60, DayOfYear.dayOfYear(2, 29, 2024));
}

    @Test
    public void testLeapYearMarch() {
        assertEquals(61, DayOfYear.dayOfYear(3, 1, 2024));
}

    @Test
    public void testNonLeapYearCentury() {
        assertEquals(60, DayOfYear.dayOfYear(3, 1, 1900));
}

    @Test
    public void testLeapYear400() {
        assertEquals(61, DayOfYear.dayOfYear(3, 1, 2000));
}

    @Test
    public void testInvalidMonthThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            
        DayOfYear.dayOfYear(13, 1, 2023);
    });
}

    @Test
    public void testInvalidDayThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            DayOfYear.dayOfYear(1, 32, 2023);
    });
}
}
