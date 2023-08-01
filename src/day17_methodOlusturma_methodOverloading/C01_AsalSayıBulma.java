package day17_methodOlusturma_methodOverloading;

import java.util.Scanner;

public class C01_AsalSayıBulma {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Asal sayı kontrolü için pozitif bir tamsayı giriniz");
        int sayı = scanner.nextInt();

        System.out.println(asalSayıMı(sayı));


    }

    public static boolean asalSayıMı(int sayı) {

        String  flag = "asai sayı";
        for (int i = 2; i < sayı; i++) {
            if (sayı % i == 0) {
                flag = "asal değil";
                break;

            }

        }
         if(sayı==2){
             return true;

         } else if (flag.equals("asal sayı")) {
            return true;

        } else {
            return false;
        }

    }
}