package org.kalkulator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean lanjut = true;

        System.out.println();
        System.out.println("======================================");
        System.out.println("Selamat datang di Kalkulator Sederhana");
        System.out.println("======================================");

        while (lanjut) {
            try {
                System.out.println("======================================");
                System.out.println("Pilih operasi yang ingin Anda lakukan:");
                System.out.println("1. Penjumlahan (+)");
                System.out.println("2. Pengurangan (-)");
                System.out.println("3. Perkalian (*)");
                System.out.println("4. Pembagian (/)");
                System.out.println("======================================");

                System.out.print("Masukkan pilihan Anda (1/2/3/4): ");
                String pilihan = scanner.nextLine();

                // Validasi operator
                Validation.validasiOperator(pilihan.charAt(0));

                // Input bilangan pertama
                System.out.print("Masukkan bilangan pertama dalam rentang -32768 s.d. 32767: ");
                String input1 = scanner.nextLine();
                double num1 = Validation.validasiInputAngka(input1, "Bilangan pertama");

                // Input bilangan kedua
                System.out.print("Masukkan bilangan kedua dalam rentang -32768 s.d. 32767: ");
                String input2 = scanner.nextLine();
                double num2 = Validation.validasiInputAngka(input2, "Bilangan kedua");

                // Validasi range
                Validation.validasiInput((int) num1, (int) num2, pilihan.charAt(0));

                // Validasi pembagi untuk pembagian
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
            System.out.print("Apakah Anda ingin melakukan perhitungan lagi? (y/n): ");
            String jawaban = scanner.nextLine();
            if (!jawaban.equalsIgnoreCase("y")) {
                lanjut = false;
                System.out.println("======================================");
                System.out.println("Terima kasih telah menggunakan kalkulator!");
                System.out.println("======================================");
            }
        }

        scanner.close();
    }
}
