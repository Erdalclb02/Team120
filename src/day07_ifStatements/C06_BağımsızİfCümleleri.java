package day07_ifStatements;

import java.util.Scanner;

public class C06_BağımsızİfCümleleri {

    public static void main(String[] args) {

        /*
         kullanıcıdan pozitif bir tam sayı isteyin
         sayı  3 veya 5 ile bolünebiliyorsa
         "Güzel sayi" yazdırın

         */


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayı giriniz");
        int girilenSayi=scanner.nextInt();

        if(girilenSayi%3==0 || girilenSayi % 5==0) System.out.println("Güzel sayı");
    }
}
