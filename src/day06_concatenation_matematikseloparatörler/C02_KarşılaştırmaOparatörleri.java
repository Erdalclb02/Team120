package day06_concatenation_matematikseloparatörler;

public class C02_KarşılaştırmaOparatörleri {


    public static void main(String[] args) {



        int a=10;
        int b=20;

        //JAVA da 0= işareti karşılaştırma değil atama işaretidir(asigmant)

        b=2*a;


        // JAVADa eşitliği kontrol etmek istersek == kullanırız

        System.out.println(b==2*a);//20==20

        //asigment a eşitliğin sol taraında sadec varieble bulunur
        //sol tarata matematik işlem olmaz
        //karşılaştırma oparatörlerinde iki tarafta da işlem olabilir

        System.out.println(3*b>5*a);//60>50===>true

        System.out.println(b>=b-a);

        System.out.println(a<=b-a);//10<=10==>true

        //Javada karşılaştırma oparatörlerinde kullanılan
        // ! işareti boolean değerini tersine çevirir


        System.out.println(a<b);//10<20==>true
        System.out.println(!(a<b));//true==>false

        System.out.println(a!=b);//true











    }
}
