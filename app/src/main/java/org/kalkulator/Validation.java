package org.kalkulator;

public class Validation {

    public static double validasiInputAngka(String input, String numBerapa) {
        try {
            return Double.parseDouble(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Error: " + numBerapa + " bukan angka.");
        }
    }

    public static void validasiInput(double num1, double num2, char operator){
        if (num1 < -32768 || num1 > 32767){
            throw new IllegalArgumentException("Error: Bilangan Pertama tidak berada pada rentang.");
        }
        if (num2 < -32768 || num2 > 32767){
            throw new IllegalArgumentException("Error: Bilangan Kedua tidak berada pada rentang.");
        }
    }

    public static void validasiOperator(String operator){
        if (!operator.equals("1") && !operator.equals("2") && 
            !operator.equals("3") && !operator.equals("4")) {
            throw new IllegalArgumentException( "Error: operator tidak valid");
        }
    }

    public static void validasiPembagi(int num2, char operator) {
        if (operator == '4' && num2 == 0) {
            throw new IllegalArgumentException("Error: pembagi tidak boleh nol");
        }
    }
}
