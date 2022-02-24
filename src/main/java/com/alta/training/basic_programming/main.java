package com.alta.training.basic_programming;

public class main {
    public static void main(String[] args) {
        vokalKonsonan();
    }

    public static void vokalKonsonan(){
        String kalimat = "Alterra Indonesia";

        int vokal = 0;
        int konsonan = 0;
        int spasi = 0;
        int panjangTeks = kalimat.length();

        for (int i = 0; i < panjangTeks; i++)
        {
            char huruf = Character.toLowerCase(kalimat.charAt(i));
            if (huruf == 'a' || huruf == 'i' || huruf == 'u' || huruf == 'e' || huruf == 'o')
                vokal++;
            else if (Character.isWhitespace(huruf))
                spasi++;
            else
                break;

        }
        System.out.println("Kalimatnya adalah : "+kalimat);
        System.out.println("Jumlah huruf vokal = " + vokal);
        System.out.println("Jumlah huruf konsonan = " + (panjangTeks - vokal - spasi));
        System.out.println("Total huruf = " + (panjangTeks - spasi));
    }
}
