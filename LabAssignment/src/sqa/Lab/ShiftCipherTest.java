package sqa.lab;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ShiftCipherTest {

    ShiftCipher cipher = new ShiftCipher();

    @Test
    void testTC01_UpperCase() {
        assertEquals("ZVMADHYL", cipher.shift("SOFTWARE", 3));
    }

    @Test
    void testTC02_LowerCase() {
        assertEquals("zvmadhyl", cipher.shift("software", 3));
    }

    @Test
    void testTC03_Computer() {
        assertEquals("FRPSXWHU", cipher.shift("COMPUTER", 3));
    }

    @Test
    void testTC04_WithNumbers() {
        assertEquals("GHNFRP67", cipher.shift("DEKCOM67", 3));
    }
}