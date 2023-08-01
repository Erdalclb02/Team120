package day10_switchCase_StringManipulations;

import java.util.Locale;

public class C03_StringManipulation {

    public static void main(String[] args) {

        /*
        String manipulation,
        verilen bir String üzerinde hazır metod'lar kullanarak
        -değişiklik yapmak
        -veya verilen String üzerindeki bir bilgiyi
        almak için yaptığımız tüm işlemlerdir

         String üzerinde yapılan manipulation işlemleri Stringi
          kalıcı olarak değiştirmez
          Eğer yapılan işlem sonucundaki yeni halin kalıcı olmasını istersek
           ATAMA YAPMALIYIZ
         */

        String str ="Java Candır";

        //str 'ın ilk harfini yazdırın
        System.out.println(str.charAt(0));

        //str 'ın tüm harfleri büyük olacak şekilde yazdırın
        System.out.println(str.toUpperCase());//JAVA CANDIR

        str=str.toLowerCase();
        System.out.println(str);//java candır
















    }
}
