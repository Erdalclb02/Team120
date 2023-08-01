package day07_ifStatements;

import java.util.Scanner;

public class C07_IfElseStatements {

    public static void main(String[] args) {

        //kullanıcıdan notunu isteyin
        //50 ve üzeri ise sınıfı geçtin
          //değilse maalesef kaldın yazdırır

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz");

        double not= scanner.nextDouble();

        if(not>=50) System.out.println("Sınıfı geçtin");
        if(not>50) System.out.println( "Sınıfta kaldın");        ;

        /*
        Eğer bir şart için sadece 2 durum söz konusu ise iki durumu ayri ayri
        kontrol etmek yerine tek bir kontrol ile de yapabiliriz

        Bağımsız if cümlelerinden farklı olarak if else cümlelerinde
        ya if body' si çalışır ya else body'si çalışır

         */

        if(not>=50){

            System.out.println("Sinifi gectin");
        } else {
            System.out.println("Maalesef kaldin");
        }

        }
}
