package org.kalkulator;

public class Validation {

    public static double validasiInputAngka(String input) {
        try {
            return Double.parseDouble(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Error: " + input + " bukan angka");
        }
        //nnti di mainnya misal int num1 = validasiInputAngka(angka1)
    }

    public static void validasiInput(double num1, double num2, char operator){
        if (num1 < -32768 || num1 > 32767){
            throw new IllegalArgumentException("Error: Angka pertama yang diinputkan tidak berada pada rentang");
        }
        if (num2 < -32768 || num2 > 32767){
            throw new IllegalArgumentException("Error: Angka kedua yang diinputkan tidak berada pada rentang");
        }
    }

    public static void validasiOperator(int operator) {
        if (operator < 1 || operator > 4) {
            throw new IllegalArgumentException("Error: Operator yang dipilih tidak valid");
        }
    } 

    public static void validasiPembagi(int num2, char operator) {
        if (operator == 4 && num2 == 0) {
            throw new IllegalArgumentException("Error: Pembagi tidak boleh nol!");
        }
    }
}
