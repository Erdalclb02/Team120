package day27_parametreliConstructor_constrructorCall;

public class C04_ArabaRunner {

    public static void main(String[] args) {


        C03_Araba araba1=new C03_Araba();
        System.out.println(araba1);

        araba1.marka="Mercedes";
        araba1.model="E200";
        araba1.yıl=2010;
        araba1.fiyat=15000;
        araba1.renk="siyah";

        System.out.println(araba1);

        C03_Araba araba2=new C03_Araba("BMW", "5.20", "2017", 33000,"Mavi" );






    }
}
