package org.kalkulator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class ValidationTest {

	//TC01:Menguji input pertama bukan berupa angka yaitu abjad
	@Test
    public void testvalidasiInputAngka1() {
        String input = "yyy";  
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            Validation.validasiInputAngka(input);
        });
        assertEquals("Error: Input bukan angka.", thrown.getMessage());
    }

	//TC02:Menguji input valid berupa angka pada 
	@Test
    public void testvalidasiInputAngka2() {
        String input1 = "2.7"; 
		String input2 = "3.0";  

		double result1 = Validation.validasiInputAngka(input1);
        double result2 = Validation.validasiInputAngka(input2);

        assertEquals(2.7, result1);
        assertEquals(3.0, result2);
    }
	
	//TC03:Menguji input kedua yang berupa angka dengan kondisi tidak berada pada rentang -32,768 hingga 32,767
    @Test
    public void testvalidasiInputNum2Invalid() {
        double input1 = 23; 
        double input2 = 908765;  

        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            Validation.validasiInput(input1, input2);
        });
        
        assertEquals("Error: Bilangan Kedua tidak berada pada rentang.", thrown.getMessage());
    }

    //TC04:Menguji input pertama yang berupa angka dengan kondisi tidak berada pada rentang -32,768 hingga 32,767
    @Test
	public void testvalidasiInputNum1Invalid() {
        double input1 = -56789; 
        double input2 = 23;  

        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            Validation.validasiInput(input1, input2);
        });
        
        assertEquals("Error: Bilangan Pertama tidak berada pada rentang.", thrown.getMessage());
    }

    //TC05:Menguji input opsi operator bukan berupa operasi basic +,-,*,/
    @Test
    public void testvalidasiOperatorInvalid(){
        char pilihan = '7';

        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            Validation.validasiOperator(pilihan);
        });
        
        assertEquals("Error: operator tidak valid", thrown.getMessage());
    }

    //TC06:Menguji input angka pembagi sama dengan nol (0)
    @Test
    public void testvalidasiPembagiInvalid() {
        double num2 = 0;  
        char pilihan = '4';  

        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            Validation.validasiPembagi(num2, pilihan);
        });
        
        assertEquals("Error: pembagi tidak boleh nol", thrown.getMessage());
    }
}

