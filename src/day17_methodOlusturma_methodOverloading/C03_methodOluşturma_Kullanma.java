package day17_methodOlusturma_methodOverloading;

import day16_methodOluşturma_Kullanma.C01_MethodOlusturma;
import day16_methodOluşturma_Kullanma.C03_MethodOlusturma;
import day16_methodOluşturup_Kullanma.C03_MethodOluşturma;

public class C03_BaskaClassdanMethodKullanma {

    public static void main(String[] args) {

        C01_MethodOluşturma.altString("Method budur...",7,8); // b
        System.out.println(C03_MethodOluşturma.isimDuzenle("omer", "GOK"));
        // Omer Gok

        System.out.println(C01_AsalSayıBulma.asalSayıMı()Mi(59)); // true
        System.out.println(C02_TamBölenlerSayısınıBulma.tamBolenlerSayisi(12)); // 6
    }
}