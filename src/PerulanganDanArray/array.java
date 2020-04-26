package PerulanganDanArray;

import java.util.Scanner;

public class array {
    public static void main(String[] args){
        String npm, nama, hasil;
        double[] IPS = new double [9];
        double ipk,rata_rata;
        int jumlah = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan NPM : ");
        npm = scanner.nextLine();
        System.out.print("Masukkan Nama : ");
        nama = scanner.nextLine();
        System.out.println("\nMasukkan Data : ");

        for(int i=1; i<=8; i++){
            System.out.print("Nilai IPS " + i +" :");
            IPS[i] = scanner.nextDouble();
            jumlah += IPS[i];
        } ipk = jumlah/8;
        System.out.println("==========================");
        if(ipk>0 && ipk<=2.5){
            hasil="Tidak Memuaskan";
        }else if (ipk>2.5 && ipk<=2.9){
            hasil="Memuaskan";
        }else if (ipk>2.9 && ipk<=3.4){
            hasil="Sangat Memuaskan";
        }else{
            hasil="Dengan Pujian";
        }

        System.out.println("jumlah : " + jumlah);
        System.out.println("IPK : " + ipk);
        System.out.println("Hasil : " + hasil);
    }
}

