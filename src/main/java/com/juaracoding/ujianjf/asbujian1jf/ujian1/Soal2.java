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

public class Soal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Soal1.movie();
        System.out.println("Masukkan judul yang anda inginkan :");
        setTittle(scanner.nextLine());
    }

    static void setTittle (String tittle){
        System.out.println("Nama film dalam huruf besar : "+tittle.toUpperCase());
        System.out.println("Nama film dalam huruf kecil : "+tittle.toLowerCase());
    }

}
