package com.alta.training.basic_programming;

public class main {
    public static void main(String[] args) {
//        vokalKonsonan();
//        x_o();
//        faktorBilangan();
//        bilanganPrima();
//        palindrome();
        exponentation();
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

    public static void x_o() {
        int hit_x = 0;
        int hit_o = 0;

        String contoh1 = "xoxoxoo";
        int panjangTeks = contoh1.length();

        for (int i = 0; i < panjangTeks; i++){
            if (contoh1.charAt(i) == 'x')
                hit_x++;
            else if (contoh1.charAt(i) == 'o')
                hit_o++;
            else break;
        }
        if (hit_o == hit_x)
            System.out.println("True");
        else
            System.out.println("False");
    }

    public static void faktorBilangan() {
        int input = 20;

        for (int i = 1; i <= input; i++){
            if (input % i == 0)
                System.out.println(i);
        }
    }
    public static void bilanganPrima() {
        int bill = 1;
        int pembagi = 0;

        for (int i = 1; i <= bill; i++){
            if (bill % i == 0)
                pembagi++;

        }
        if (pembagi == 2)
            System.out.println(bill +" = Bilangan Prima");
        else
            System.out.println(bill +" = Bukan bilangan Prima");
    }
    public static void palindrome(){
        String kata = "katak";

        String poli = "";
        for(int i = kata.length()-1; i >= 0; i--){
            char c = kata.charAt(i);
            poli = poli + String.valueOf(c);
        }
        if (kata.equals(poli))
            System.out.println(kata+" adalah Palindrome");
        else
            System.out.println(kata+" bukan Palindrome");
    }
    public static void exponentation(){
        int x = 3;
        int n = 2;

        System.out.println(x + " pangkat " + n + " = "+ (int)Math.pow(x,n));

    }
}
