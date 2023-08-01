package day09_NestedIfElseStatements_Ternary;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {


        //kullnıcıdan pozitif bir sayı alın
        //syının tek mi çift mi olduğunu yazdırın


        Scanner scanner=new Scanner(System.in);

        System.out.println("Lütfen pozitif bir tamsayı giriniz");

        int sayi= scanner.nextInt();
        if(sayi% 2==0){
            System.out.println("Çift sayı");
        }

        /*
        if else ile yapabileceğimiz basit işlemleri
        daha kısa olarak yazabilmek için ternary kullanılabilir
         */

        System.out.println(sayi%2==0 ? "Çift sayi": "Tek sayi");

    }
}
