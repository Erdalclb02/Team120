package day10_switchCase_StringManipulations;

public class C05_equels {
    public static void main(String[] args) {

        String str1="Mehmet";
        String str2="MEHMET";
        String str3="Mehmet";
        String str4="MEHmet";

        System.out.println(str1==str2);//false

        System.out.println(str3==str4.toLowerCase());//mehmet==mehmet false
        System.out.println(str2==str3.toUpperCase());//MEHMET==MEHMET false

        /*
        String lerde== beklediğimiz sonuçları DÖNMEYEBİLİR
        Bunun sebebi String class 2ını oluştururken yapılan bazı özelliklerdir

          Verilen  iki String in metinsel olarak aynı olup olmadığını kontrol etmek için==yerine eqals()kullanılır

        equals() 'u bire bir aynı olan ikimetin için true,
        farklı metinler için false sonucu üretir(döndürür)
        bu karşılaştırmada metnin aynı olması yanında
        büyük küçük harf durumunu da kontro eder

        EĞER case sensitive olmadan metinleri karşılaştırmak isterseniz
        equalsIgnoreCase() 'u kullanılır
         */

        System.out.println(str1.equals(str2));//mehmet--MEHMET false
        System.out.println(str3.equals(str4.toLowerCase()));//mehmet==mehmet false
        System.out.println(str2.equals(str3.toUpperCase()));//MEHMET==MEHMET false

        System.out.println(str1.equalsIgnoreCase(str2));//Mehmet--MEHMET TRUE

        System.out.println(str1.equalsIgnoreCase(str3));//Mehmet--mehmet true
        System.out.println(str1.equalsIgnoreCase(str4));//mehmet--MEHmet true
        

    }
}
