package day04_dataCasting_wrapperClass;

public class C03_CharDataCasting {
    public static void main(String[] args) {


        /* char data türü özel bir data türüdür.
        her ne kadar char data türü
        ' ' içerisinde  sayi, harf, öel karakter olsa da
         Ascii tablosundaki sayısal değerleride kullanabilir
        ascii tablosundaki değer ile matematiksel işleme girer

         */

        char ch1='A';

        int sayi1=ch1;
        System.out.println("ch1: "+ch1);
        System.out.println("sayi1: "+sayi1);

     String str1="Java";
     String str2="";
     String str3="Candir";
        System.out.println(str1+str2+str3);//JavaCandir

        char ch2='a';
        char ch3='b';
        System.out.println(ch2+ch3); //195

        char ch4='E';
        char ch5='Ç';
        System.out.println(ch4 +ch5);//268

       // VERİLEN İNT BİR SAYının Ascii Tablosundaki char karşılığını yazdırın

        int karakter=50;
        char asciDeğeri=(char) karakter;

        System.out.println("Verilen sayinin ascii tablosundaki karşılığı :"+ asciDeğeri);












    }
}
