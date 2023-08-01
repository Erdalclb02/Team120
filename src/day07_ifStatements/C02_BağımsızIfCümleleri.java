package day07_ifStatements;

public class C02_BağımsızIfCümleleri {

    public static void main(String[] args) {

        /*
        1- Dikkat deilecekler:
        Eğer boolean şarttan sonra {} kullanılmaz ise
        Java if body' si olarak ilk ; e kadar olan bölümü alır
        diğerleri if body'sinin dışında kalır

         2- if cümlesinde {} kullanmaz ve boolean şartın sonuna ; yazarsak
         if cümlesi hiçbir işlem yapmaz çünkü body'siyoktur.

         ÖZETLE:
         if body'si tek satırdan oluşuyorsa{} kullanmasanızda olur
         ancak if body'si birdn fazla saıtdan oluşuyorsa MUTLAKA {} kullanmalısınız.

         */
        int a=20;
        int b=30;

    if(a<b){
        System.out.println("a b'den küçük 1");

        System.out.println("a b'den küçük 2");

        System.out.println("a b'den küçük 3");

    }

     if(a%2==0)

         System.out.println("a 2 ile tam bölünüyor 1");// bu ilk ; e kadar olan kısım if bodysidir.
                                                      // sonraki satırların if ile ilgisi yoktur


        System.out.println("a  2 ile tam bölünüyor 2");

        System.out.println("a 2 ile tam bolunuyor 3");
    }
}




