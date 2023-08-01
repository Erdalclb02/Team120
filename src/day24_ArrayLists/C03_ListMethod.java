package day24_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class C03_ListMethod {
    public static void main(String[] args) {


        List<Integer> sayılar= new ArrayList<>();
        System.out.println(sayılar);//[]
        System.out.println(sayılar.size());//0
        System.out.println(sayılar.isEmpty());//true


        sayılar.add(3);
        sayılar.add(5);

        System.out.println(sayılar);//[3,5]
        System.out.println(sayılar.size());//2
        System.out.println(sayılar.isEmpty());//false
        System.out.println(sayılar.get(1));//5

        //verilen index'deki elementi döndürür

        System.out.println(sayılar.contains(3));//true


        List<Integer> tümsayılar=new ArrayList<>();
        tümsayılar.add(1);
        tümsayılar.add(3);
        tümsayılar.add(5);
        tümsayılar.add(7);

        System.out.println(tümsayılar.containsAll(sayılar));//true




    }
}
