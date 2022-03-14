package com.alta.training.section_11_12_OOP.challenge2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("===========---------SIMPLE CALCULATOR----------==============");
        System.out.println("1. Open Calculator");
        System.out.println("99 Exit");
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Pilihan anda : ");

        Integer pilMenu = input.nextInt();

        switch (pilMenu){
            case 1:
                System.out.println("===========---------SIMPLE CALCULATOR----------==============");
                System.out.print("Masukan nilai 1 : ");
                Integer nilai_1 = input.nextInt();
                System.out.print("Masukan nilai 2 : ");
                Integer nilai_2 = input.nextInt();

                calculation calculation = new calculation(nilai_1,nilai_2);

                System.out.println("===========---------SIMPLE CALCULATOR----------==============");
                System.out.println("Pilih operasi :");
                System.out.println("1. penjumlahan");
                System.out.println("2. pengurangan");
                System.out.println("3. perkalian");
                System.out.println("4. pembagian");
                System.out.println("===========---------SIMPLE CALCULATOR----------==============");
                System.out.print("Pilihan anda : ");
                Integer pillOperasi = input.nextInt();
                switch (pillOperasi){
                    case 1:
                        System.out.println("===========---------SIMPLE CALCULATOR----------==============");
                        System.out.println("Pilihan anda : " + pillOperasi);
                        System.out.println("Hasil : " + calculation.add());
                        break;
                    case 2:
                        System.out.println("===========---------SIMPLE CALCULATOR----------==============");
                        System.out.println("Pilihan anda : " + pillOperasi);
                        System.out.println("Hasil : " + calculation.sub());
                        break;
                    case 3:
                        System.out.println("===========---------SIMPLE CALCULATOR----------==============");
                        System.out.println("Pilihan anda : " + pillOperasi);
                        System.out.println("Hasil : " + calculation.multiply());
                        break;
                    case 4:
                        System.out.println("===========---------SIMPLE CALCULATOR----------==============");
                        System.out.println("Pilihan anda : " + pillOperasi);
                        System.out.println("Hasil : " + calculation.divide());
                        break;
                }
                break;
            case 99:
                break;

        }
    }
}
