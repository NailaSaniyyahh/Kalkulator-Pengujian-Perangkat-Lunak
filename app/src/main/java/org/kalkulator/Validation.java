package org.kalkulator;

public class Validation {

    public static double validasiInputAngka(String input, String numBerapa) {
        try {
            return Double.parseDouble(input);
        } catch (NumberFormatException e) {
            //numberapa maksudnya angka keberapa yang diinputkan yg bukan angka
            throw new IllegalArgumentException("Error: " + numBerapa + " bukan angka.");
        }
    }

    public static void validasiInput(int num1, int num2, char operator){
        if (num1 < -32768 || num1 > 32767){
            throw new IllegalArgumentException("Error: num1 tidak berada pada rentang.");
        }
        if (num2 < -32768 || num2 > 32767){
            throw new IllegalArgumentException("Error: num2 tidak berada pada rentang.");
        }
    }

    public static void validasiOperator(String operator){
        if (!operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("/")) {
            throw new IllegalArgumentException( "Error: operator tidak valid");
        }
    }

    public static void validasiPembagi(int num2, char operator) {
        if (operator == '/' && num2 == 0) {
            throw new IllegalArgumentException("Error: pembagi tidak boleh nol");
        }
    }
}
