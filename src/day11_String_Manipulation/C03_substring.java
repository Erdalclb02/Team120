package day11_String_Manipulation;

import java.sql.SQLOutput;

public class C03_substring {

    public static void main(String[] args) {

        String str="Java Candır";
        /*
        substring() bize verilen bir String in istenen parçasını alma imkanı tanır
        2 türlü kullanımı vardır;

        1- başlangıç index 'ini verirseniz o indxten sona kadar olan kısmı verir
        2-başlangıç ve bitiş indexlerini verirseniz
        başlangıç index'inden (dahil) başlar
        bitiş index'ine kadar (hariç) aradaki karakterleri yazdırır

         */
        System.out.println(str.substring(3));// a Candır
        System.out.println(str.substring(7));// ndir
        System.out.println(str.substring(0));//Java Candır

        System.out.println(str.substring(11));//hiçlik yazdırır

        //System.out.println(str.substring(15));//sınırların dışında olduğu için hata verir

        //"Java Candır";

        System.out.println(str.substring(3,6));// a C yazdırı

        System.out.println(str.substring(5,10));// Candı yazdırır

        System.out.println(str.substring(1,2));// a yazdırır

        System.out.println(str.substring(6,7));// a yazdırır


        //  bu yazım bize istenen index'deki tek bir elementi verir
        //  charAt()'e benzer ama artı bir özelliği vardır
        //substring bize String verdiği için manipulation yapmaya devam edebiliriz

        //6.indexdeki harfi büyük harf olarak yazdırın
        System.out.println(str.substring(6,7).toUpperCase());//a
        System.out.println(str.substring(3,3));// hiçlik yazdırır
       // System.out.println(str.substring(8,5));//böyle bir durum yoktur yazdırır

        //son üç harfi yazdırın

        System.out.println(str.substring(str.length()-3));// dır yazdırır

        System.out.println(str.substring(str.length()-5));//andır

        String str1="Jva";
       String  str2=" ";
        String str3="Candır";

        System.out.println(str1+str2+str3);// Java Candır
        System.out.println(str1.concat(str2).concat(str3));//Java Candır









    }
}
