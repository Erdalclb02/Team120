package day09_NestedIfElseStatements_Ternary;

import java.util.Scanner;

public class C09_İndirimHesaplama {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("lütfen ürün adedini giriniz");
        int urunSayısı = scanner.nextInt();

        System.out.println("Lütfen liste fiyatı giriniz");
        double listeFiyatı = scanner.nextDouble();

        System.out.println("Müşteri kartınız var mi? \nE: E vet, H:Hayır");
        char kartVarmı = scanner.next().toUpperCase().charAt(0);

        //ana deşğişken kart varmı bilgisi olsun

        if (kartVarmı == 'E') { //Kartı olmayanlar


        }
    }
}
