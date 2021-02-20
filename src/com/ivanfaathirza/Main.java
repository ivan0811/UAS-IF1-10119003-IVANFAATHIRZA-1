package com.ivanfaathirza;
import java.util.Scanner;

//NIM : 10119003
//NAMA : IVAN FAATHIRZA
//KELAS : IF1
//TANGGAL : 20 FEBRUARI 2021
//NO SOAL : 1

public class Main {

    public static void main(String[] args) {
	// write your code here
        double nilai;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nilai Akhir Anda : ");
        nilai = scanner.nextDouble();

        IndeksNilai indeks = new IndeksNilai();
        System.out.println("Indeks Anda Adalah " + indeks.Addindex(nilai));
    }
}
