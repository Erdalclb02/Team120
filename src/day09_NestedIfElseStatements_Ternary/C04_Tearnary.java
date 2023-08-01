package day09_NestedIfElseStatements_Ternary;

public class C04_Tearnary {

    public static void main(String[] args) {


        // input olarak verilen bir sayının 3 ile bölünüp bölünmediğni bulun

    int input=20;

    //input%3=0 ? "3 ile tam bölünüyor" : "3 ile  tam bölünmüyor";
        // bu soruda ternary  bize bir String  donduruyor.
        //bunu YA direk yazdırmalıyız
        //VEYA bir String variable atamalısınız

        //System.out.println(input%3=0 ? "3 ile tam bölünüyor" : "3 ile  tam bölünmüyor");

        String sonuc=input%3==0 ? "3 ile tam bölünüyor" : "3 ile  tam bölünmüyor";

        System.out.println(sonuc);


        //verilen input çift ise "çift sayı"
        // input tek sayı ise 2*input sonucunu veren bir ternaray yazın

        System.out.println(input%2==0 ? "çift sayı": 2*input);





    }
}
