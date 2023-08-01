package day11_String_Manipulation;

import org.w3c.dom.ls.LSOutput;

public class C05_startsWith_endsWith {

    public static void main(String[] args) {


        String str="Java çok güzel";

        //str Java ile mi başlıyor?

        System.out.println(str.startsWith("Java"));//true

        //str J ile mi başlıyor?

        System.out.println(str.startsWith("J"));//true

        //str "Java çok güzel" ile mi başlar?

        System.out.println("Java çok güzel");//true

        System.out.println(str.startsWith(" "));//true


        //5. index'ten sonrası c ile mi başlar?
        System.out.println(str.startsWith("c" , 5
                ));//true

        //6.index 'ten sonrası c ile mi başlar?
        System.out.println(str.startsWith("ok",6));//true

         //"Java çok güzel"

        //str güzel ile mi biter?

        System.out.println(str.endsWith("güzel"));//true

        //str el ile mi biter?

        System.out.println(str.endsWith("el"));//true

        //str l ile mi biter

        System.out.println(str.endsWith("l"));//true

        System.out.println(str.endsWith(" "));//false



    }



}
