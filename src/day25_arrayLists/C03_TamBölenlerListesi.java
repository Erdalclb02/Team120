package day25_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C03_TamBölenlerListesi {

    public static void main(String[] args) {


       /* Soru 6- Verilen pozitif bir tamsayi alip,
        tam bolebilen tum pozitif tamsayilari
        bir liste olarak bize donduren bir method olusturun.
        */

        System.out.println(pozitifTamBölenlerListesi(20));//[1,2,4,5,20]
        System.out.println(pozitifTamBölenlerListesi(120));


    }
    public static List<Integer> pozitifTamBölenlerListesi(int sayı){

        List<Integer> tamBölenlerListesi=new ArrayList<>();

        for (int i = 1; i <=20; i++) {
            if (sayı % i==0){
                tamBölenlerListesi.add(i);
            }

        }
        return tamBölenlerListesi;
    }
}
