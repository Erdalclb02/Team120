package day24_ArrayLists;

import javax.xml.parsers.SAXParser;
import java.util.ArrayList;
import java.util.List;

public class C04_Remove {

    public static void main(String[] args) {

        List<String> isimler=new ArrayList<>();
        isimler.add("Kaan");
        isimler.add("Bülent");
        isimler.add("Tuğba");
        isimler.add("Burhan");
        isimler.add("Kaan");
        System.out.println(isimler);//[Kaan,Bülent,Tuğba,Burhan,Kaan]

        System.out.println(isimler.remove("Hasan"));//false
        System.out.println(isimler.remove("Kaan"));//true

        System.out.println(isimler);//[Bülent,Tuğba,Burhan,Kaan]
        System.out.println(isimler.remove(1));//Tuğba
        System.out.println(isimler);//[Bülent,Burhan,Kaan]


        List<Integer> sayılar=new ArrayList<>();
        sayılar.add(3);
        sayılar.add(5);
        sayılar.add(7);
        sayılar.add(1);

        System.out.println(sayılar);//[3,5,7,1]
        sayılar.remove(1);
        System.out.println(sayılar);//[3,7,1]

        // ben illada element olan 1'i silmek istersem
        Integer silinecekElement=1;
        sayılar.remove(silinecekElement);
        System.out.println(sayılar);//[3,7]

        sayılar.clear();
        System.out.println(sayılar);//[]



    }
}
