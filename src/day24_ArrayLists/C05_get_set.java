package day24_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class C05_get_set {
    public static void main(String[] args) {


        List<String> isimler=new ArrayList<>();
        isimler.add("Cemil");
        isimler.add("Ömer");
        isimler.add("Mertkan");

        isimler.add(2,"Burhan");
        System.out.println(isimler);


        //set() ile add() arasındaki fark
        //add() araya ekler kalanları kaydırır
        //set() ise update eder / varolan elementin değerini değiştirir

        isimler.set(2,"Ayşe");
        System.out.println(isimler);//[Cemil,Ömer,Ayşe,Mertkan]

        System.out.println(isimler.get(1));//Ömer
        System.out.println(isimler); // [Cemil, Omer, Ayse, Mertkan]











    }
}
