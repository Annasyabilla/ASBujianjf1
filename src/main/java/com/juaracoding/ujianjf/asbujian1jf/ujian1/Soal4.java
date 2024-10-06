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

public class Soal4 {
    public static void main(String[] args) {
        String[] tittle = new String[5];
        judulFilm(tittle);

    }

    static void judulFilm(String[] judul){
        System.out.println("Masukkan lima film yang ingin anda tonton");
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Masukkan nama film "+(i+1)+" : ");
            judul[i] = scanner.next();
        }

        System.out.println("Film yang ingin ditonton:");
        for (int i = 0; i < judul.length; i++) {
            System.out.println((i + 1) + ". " + judul[i]);

        }
    }
}
