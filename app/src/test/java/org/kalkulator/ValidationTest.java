package org.kalkulator;

import org.junit.Before;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class ValidationTest {
    private Validation sut;

    @Before
    public void setUp() throws Exception{
        sut = new Validation();
    }

    @Test
    public void testValidasiInputAngka_ValidInput_ReturnsDouble() {
        String input = "123.45";
        String numBerapa = "Angka Pertama";
        double result = Validation.validasiInputAngka(input, numBerapa);
        assertEquals(123.45, result, 0.001);
    }

    @Test
    public void testValidasiInputAngka_InvalidInput_ThrowsException() {
        String input = "abc";
        String numBerapa = "Angka Pertama";
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Validation.validasiInputAngka(input, numBerapa);
        });
        assertEquals("Error: Angka Pertama bukan angka.", exception.getMessage());
    }
}
