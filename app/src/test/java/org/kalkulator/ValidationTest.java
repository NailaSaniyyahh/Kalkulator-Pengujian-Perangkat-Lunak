package org.kalkulator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class ValidationTest {

	//TC01
	@Test
    public void testvalidasiInputAngka1() {
        String input = "yyy";  
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            Validation.validasiInputAngka(input);
        });
        assertEquals("Error: Input bukan angka.", thrown.getMessage());
    }

	//TC02
	@Test
    public void testvalidasiInputAngka2() {
        String input1 = "2.7"; 
		String input2 = "yyy";  
        // IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
        //     Validation.validasiInputAngka(input);
        // });
        // assertEquals("Error: Input bukan angka.", thrown.getMessage());
		double num1 = Validation.validasiInputAngka(input1);
        assertEquals(2.7, num1, "num1 harus valid dan dikembalikan sebagai 2.7");

        IllegalArgumentException thrown2 = assertThrows(IllegalArgumentException.class, () -> {
            Validation.validasiInputAngka(input2);  // Validasi untuk num2
        });
        assertEquals("Error: Input bukan angka.", thrown2.getMessage());
    }
	
	//TC03
	@Test
    void testvalidasiInput1() {
        double num1 = 23;     
        double num2 = 908765;    

        // Memastikan IllegalArgumentException dilemparkan untuk num2
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            Validation.validasiInput(num1, num2);
        });
        assertEquals("Error: Bilangan Kedua tidak berada pada rentang.", thrown.getMessage());
    }

	//TC04
	@Test
    void testvalidasiInput2() {
        double num1 = 908765;     
        // double num2 = null;    

        // Memastikan IllegalArgumentException dilemparkan untuk num2
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            // Validation.validasiInput(num1, num2);
        });
        assertEquals("Error: Bilangan Kedua tidak berada pada rentang.", thrown.getMessage());
    }
}

