package day11_String_Manipulation;

public class C04_Contains {
    public static void main(String[] args) {

        String str="Java gün geçtikçe güzeleşiyor";

        //str Java içeriyor mu?

        System.out.println(str.contains("Java"));//true

        //str java içerir mi?
        System.out.println(str.contains("java"));//false olur

        //str a içerir mi?
        System.out.println(str.contains("a"));//true

        //*** contains methodu aranan metnin sayısıyla ilgilenmez
        // sadece


    }
}
