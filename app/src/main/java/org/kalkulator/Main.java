package org.kalkulator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean lanjut = true;

        System.out.println("======================================");
        System.out.println("Selamat datang di Kalkulator Sederhana");
        System.out.println("======================================");

        while (lanjut) {
            try {
                // Menampilkan menu
                showMenu();

                // Ambil pilihan operasi
                String pilihan = getOperatorChoice(scanner);

                // Validasi operator
                Validation.validasiOperator(pilihan.charAt(0));

                // Ambil angka pertama dan kedua
                double num1 = getValidNumber(scanner, "Masukkan bilangan pertama: ");
                Validation.validasiInput((int) num1, 0, pilihan.charAt(0));
                double num2 = getValidNumber(scanner, "Masukkan bilangan kedua: ");
                Validation.validasiInput((int) num1, (int) num2, pilihan.charAt(0));

                // Validasi pembagian
                Validation.validasiPembagi((int) num2, pilihan.charAt(0));

                // Hitung hasil
                double hasil = Calculate.calculate(pilihan.charAt(0), num1, num2);
                System.out.println("======================================");
                System.out.println("Hasil: " + hasil);
                System.out.println("======================================");

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            // Tanya ke user mau lanjut atau tidak
            lanjut = askForContinue(scanner);
            System.out.println("======================================");
            System.out.println("Terima kasih telah menggunakan kalkulator!");
            System.out.println("======================================");
        }

        scanner.close();
    }

    // Menampilkan menu pilihan
    private static void showMenu() {
        System.out.println("======================================");
        System.out.println("Pilih operasi yang ingin Anda lakukan:");
        System.out.println("1. Penjumlahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian (*)");
        System.out.println("4. Pembagian (/)");
        System.out.println("======================================");
    }

    // Mengambil pilihan operator dari pengguna
    private static String getOperatorChoice(Scanner scanner) {
        System.out.print("Masukkan pilihan Anda (1/2/3/4): ");
        return scanner.nextLine();
    }

    // Mengambil input angka dan melakukan validasi
    private static double getValidNumber(Scanner scanner, String prompt) {
        double num;
        while (true) {
            try {
                System.out.print(prompt);
                String input = scanner.nextLine();
                num = Validation.validasiInputAngka(input, prompt);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return num;
    }

    // Menanyakan apakah pengguna ingin melanjutkan perhitungan
    private static boolean askForContinue(Scanner scanner) {
        System.out.print("Apakah Anda ingin melakukan perhitungan lagi? (y/n): ");
        String jawaban = scanner.nextLine();
        return jawaban.equalsIgnoreCase("y");
    }
}