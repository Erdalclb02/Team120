package day11_String_Manipulation;

import java.util.Scanner;

public class C02_length {
    public static void main(String[] args) {


        String isim = "Ramazan Uzunkavaklaraltindayataruyumazoglu";

        // son harfi yazdirin

        System.out.println("isim uzunlugu : " + isim.length()); // 42

        System.out.println("son harf : " + isim.charAt(isim.length() - 1)); // u


        // sondan 5.harfi yazdirin
        System.out.println(isim.charAt(isim.length() - 5)); // z

        // kullanicidan ismini alin
        // ve ortadaki harfi yazdirin
        // ismin uzunlugu cift sayi ise orta kisimdaki 2 harfi yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen isminizi yaziniz");
        String girilenIsim = scanner.nextLine();

        int uzunluk = girilenIsim.length();

        if (uzunluk % 2 == 0) { // uzunluk ciftse
            System.out.println("Uzunluk cift, ortadaki iki harf : " +
                    girilenIsim.charAt(uzunluk / 2 - 1) +
                    girilenIsim.charAt(uzunluk / 2));

        } else { // uzunluk tekse
            System.out.println("Uzunluk tek, ortadaki harf : " + girilenIsim.charAt((uzunluk - 1) / 2));
        }


       //String isim="Rmazan Uzunkavaklaraltındayataruyumazoğlu";

       //son harfi yazdırın

        System.out.println("isim uzunluğu : " + isim.length());//42

        System.out.println("son harfi : " + isim.charAt(isim.length()-1));// u

        //sondan 5. harfi yazdırın
        System.out.println(isim.charAt(isim.length()-5));//z

        //kullanıcıdan ismini alın
        //ve ortadaki harfi yazdırın
        // ismin uzunluğu çift sayı ise orta kısımdaki iki harfi yazdırın



        System.out.println("Lütfen isminizi yazınız");

        String girilenisim=scanner.nextLine();

       /* int uzunluk= girilenisim.length();
        if(uzunluk % 2 == 0) { //uzunluk çiftse

            System.out.println("Uzunluk çift, ortadaki iki harf : " +
                    girilenisim.charAt(uzunluk/2-1) +
                    girilenisim.charAt(uzunluk/2));



        }else {// uzunluk tekse
            System.out.println("Uzunluk1 tek, ortadaki harf : " + girilenisim.charAt(uzunluk - 1) / 2);
*/
        }
    }

