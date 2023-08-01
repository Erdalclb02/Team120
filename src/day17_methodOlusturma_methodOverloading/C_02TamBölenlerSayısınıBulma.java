package day17_methodOlusturma_methodOverloading;

import java.util.Scanner;

public enum C_02TamBölenlerSayısınıBulma {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Pozitif tam bölenlerini bulmak istediğiniz bir sayıyı giriniz");

        int sayı = scanner.nextInt();

        System.out.println(tamBölenlerSayısı(sayı));
    }

    public static int tamBölenlerSayısı(int sayı) {

        int sayaç = 0;

        for (int i = 1; i <= sayı; i++) {
            if (sayı % i == 0) {
                sayaç++;
            }
        }
        return sayaç;
    }

}