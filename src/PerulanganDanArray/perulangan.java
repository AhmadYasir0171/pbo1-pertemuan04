package PerulanganDanArray;

import java.util.Scanner;

public class perulangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nama,hobi;
        char pilih;
        Integer umur;

        do {
            System.out.print("Masukkan Nama : ");
            nama = scanner.nextLine();
            System.out.print("Masukkan Hobi : ");
            hobi = scanner.nextLine();
            System.out.print("Masukkam Umur : ");
            umur = scanner.nextInt();
            System.out.print("Apakah ingin input ulang? ");
            pilih = scanner.next().charAt(0);
        }while(pilih == 'y' && pilih=='Y');

        System.out.println("Nama : " + nama);
        System.out.println("Hobi : " + hobi);
        System.out.println("Umur : " + umur);
    }
}