package price.formatter;

import org.junit.jupiter.api.BeforeEach; 
import org.junit.jupiter.api.Test; 
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Write your tests for the PriceFormatter here. See the specification of the
 * PriceFormatter and formatPrice method in the PriceFormatter class and the
 * readme file.
 */
public class PriceFormatterTest {

    private PriceFormatter formatter;

    @BeforeEach
    public void setUp() {
        formatter = new PriceFormatter();
}

    @Test
    public void testBasicFormattingWithDecimals() {
        String result = formatter.formatPrice(123456.78);
        assertEquals("123 456,78 €", result);
}

    @Test
    public void testRoundingDecimals() {
        String result = formatter.formatPrice(12.345);
        assertEquals("12,35 €", result);
}

    @Test
    public void testNoDecimalsIfZero() {
        String result = formatter.formatPrice(100.00);
        assertEquals("100 €", result);
}

    @Test
    public void testSmallNumber() {
        String result = formatter.formatPrice(5.5);
        assertEquals("5,50 €", result);
}

    @Test
    public void testZero() {
        String result = formatter.formatPrice(0.0);
        assertEquals("0 €", result);
}
}
