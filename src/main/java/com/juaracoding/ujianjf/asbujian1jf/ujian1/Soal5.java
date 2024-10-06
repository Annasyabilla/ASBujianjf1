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

public class Soal5 {
    public static void main(String[] args) {
        int price [] = new int[5];
        totalHarga(price);
    }

    static void totalHarga(int[] harga){
        int sum  = 0;
        harga[0] = 50000;
        harga[1] = 60000;
        harga[2] = 70000;
        harga[3] = 80000;
        harga[4] = 90000;

        for (int i = 0; i < harga.length; i++) {
            System.out.println("Harga tiket film ke-"+(i+1)+" = "+harga[i]);
            sum += harga[i];
        }
        System.out.println("Total harga tiket = "+sum);
    }
}
