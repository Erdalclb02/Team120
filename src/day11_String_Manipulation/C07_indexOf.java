package day11_String_Manipulation;

public class C07_indexOf {
    public static void main(String[] args) {

        String str="Ali topu at at ali at";

       //Ali 'nin indexi nedir? (Başladığı yer 0)
        System.out.println(str.indexOf("Ali"));//0

        //at'ın index'i nedir?   9
        System.out.println(str.indexOf("at"));//9

        // op'un index'i nedir?   5
        System.out.println(str.indexOf("op"));//5

        System.out.println(str.indexOf('a'));//9

        System.out.println(str.indexOf("a" ,10));//

        System.out.println(str.indexOf("yusuf"));// yukarıda yusuf kelimesi olmadığı için-1 yazdırır

    }
}
