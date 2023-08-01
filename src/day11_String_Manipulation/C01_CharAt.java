package day11_String_Manipulation;

public class C01_CharAt {

    public static void main(String[] args) {


     String  str="Java Candır";

     //ilk harfi yazdırın
        System.out.println(str.charAt(0));//j

      //7. harfi yazdırın
        System.out.println(str.charAt(6));//a

      //Bu metnin uzunluğu 11
        //son harfi yazdırın
        System.out.println(str.charAt(11-1));//r

        //sondan 3. harfi yazdırın
        System.out.println(str.charAt(11-3));//d

        //Not: Eğer sondan başa doğru gelecek şekilde bir char isteniyorsa
        //charAt(uzunluk-sondanKaçıncıKarakter)

        //metnin uzunluğundan daha büyük bir sıradaki karakter istenirse
        //20. karakteri yazdırın
        //System.out.println(str.charAt(20));//hata verir

        //4. harfi büyük harf olarak yazdırın
        System.out.println(str.toUpperCase().charAt(3));

        //charAt()'u bize char data türünde bir sonuç verir(döndürür)
        //toUpperCase() gibi method'lar String variabl'lar ile çalıştığından
        //charAt() çalıştıktan saonra String Manipulation YAPILMAZ
        //EĞER MANİPULATİON
        //ihtiyacı varsa charAt















    }
}
