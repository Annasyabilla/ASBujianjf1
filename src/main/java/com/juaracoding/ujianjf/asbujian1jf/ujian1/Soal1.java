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

public class Soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        movie();
        System.out.println("Masukkan judul yang anda inginkan :");
        setTittle(scanner.nextLine());
        setPrice("Harga tiket : 50000");
        System.out.println("Masukkan jumlah tiket :");

        setQTY(scanner.nextInt(), 50000);

    }

    static  void movie(){
        System.out.println("Berikut ini list film yang sedang tayang: ");
        System.out.println("1. Avengers: Endgame");
        System.out.println("2. Black Belf Officer");
        System.out.println(" ");
    }

    static void setTittle (String tittle){
        System.out.println("Nama film : "+tittle);
    }

    public static void setPrice(String price){
        System.out.println(price);
    }

    static void setQTY(int qty, int price){
        price = 50000;
        System.out.println("Jumlah tiket : "+qty);
        System.out.println("Total : "+qty*price);
    }


}
