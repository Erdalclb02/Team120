package day10_switchCase_StringManipulations;

import java.sql.SQLOutput;
import java.util.Locale;

public class C04_toUpperCase_toLowerCase {

    public static void main(String[] args) {

        String  str="Java Candır";
        System.out.println(str.toUpperCase());//JAVA CANDIR

        str=str.toUpperCase();//JAVA CANDIR (Stringimiz kalıcı olarak değiştirmiş olduk)

        System.out.println(str.toLowerCase());//java candir olur

//Eğer yerel bir dile göre büyük küçük harf değişimi yapmak istersek
        System.out.println(str.toLowerCase(Locale.forLanguageTag("Tr")));//java candır olur


    }



}
