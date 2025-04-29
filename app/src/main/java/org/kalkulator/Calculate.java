package org.kalkulator;

public class Calculate {

    // Method untuk memilih operator berdasarkan input pilihan
    public static char pilihOperator(String pilihan) {
        switch (pilihan) {
            case "1":
                return '+';
            case "2":
                return '-';
            case "3":
                return '*';
            case "4":
                return '/';
            default:
                throw new IllegalArgumentException("Error:");
        }
    }

    // Method untuk melakukan perhitungan berdasarkan angka dan operator
    public static double calculate(double num1, double num2, char operator) {
        switch (operator) {
            case '+':
                return tambah(num1, num2);
            case '-':
                return kurang(num1, num2);
            case '*':
                return kali(num1, num2);
            case '/':
                return bagi(num1, num2);
            default:
                throw new IllegalArgumentException("Error: Operator tidak dikenal.");
        }
    }

    private static double tambah(double a, double b) {
        return a + b;
    }

    private static double kurang(double a, double b) {
        return a - b;
    }

    private static double kali(double a, double b) {
        return a * b;
    }

    private static double bagi(double a, double b) {
        return a / b;
    }
}
