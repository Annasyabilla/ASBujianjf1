package com.juaracoding.ujianjf.asbujian1jf.ujian1;
/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author Lenovo Gk a.k.a. Anna Syabilla
Java Developer
Created on 10/6/2024 3:16 AM
@Last Modified 10/6/2024 3:16 AM
Version 1.0
*/

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Soal1.movie();
        System.out.println("Harga : Weekday = 35.000 || Weekend = 45.000");
        System.out.println("Catatan = Jum'at termasuk dalam harga weekday.");
        System.out.println("Dapatkan diskon 10% dengan pembelian lebih dari 5 tiket.");
        System.out.println("");

        System.out.println("Masukkan judul yang anda inginkan :");
        Soal1.setTittle(scanner.nextLine());

        System.out.println(" 1. Senin \n 2. Selasa \n 3. Rabu \n 4. Kamis \n 5. Jumat \n 6. Sabtu \n 7. Minggu");
        System.out.print("Masukkan hari dalam bentuk angka : ");
        int intHari = scanner.nextInt();
        System.out.println("");
        System.out.println("Masukkan jumlah tiket :");
        int intJumlah = scanner.nextInt();

        int intWeekday = 35000;
        int intWeekend = 45000;
        double diskon = 0.1;

        //kondisi weekdays
        if (intHari<5){
            System.out.println("Jumlah tiket : "+intJumlah);
            System.out.println("Total :"+intWeekday*intJumlah);
            if (intJumlah > 5){
                System.out.println("Diskon = 10%");
                int jumlahAsli = intWeekday*intJumlah;
                double jumlahAkhir = jumlahAsli-jumlahAsli*diskon;
                System.out.println("Total yang harus dibayar : "+jumlahAkhir);
            }
        }

        //kondisi weekend
        if (intHari >= 5){
            System.out.println("Jumlah tiket : "+intJumlah);
            System.out.println("Total :"+intWeekend*intJumlah);
            if (intJumlah > 5){
                System.out.println("Diskon = 10%");
                int jumlahAsli = intWeekend*intJumlah;
                double jumlahAkhir = jumlahAsli-jumlahAsli*diskon;
                System.out.println("Total yang harus dibayar : "+jumlahAkhir);
            }
        }

    }

}
