package day11_String_Manipulation;

import java.util.Scanner;

public class C06_Soru {
    public static void main(String[] args) {

        Scanner  scanner=new Scanner(System.in);

        System.out.println("Lütfen mail adresinizi giriniz" );
         String mail=scanner.nextLine();
         if(!mail.contains("@")){
             System.out.println("geçersiz mail");
         }else if(mail.contains("@gmail.com")){
             System.out.println("mail gmail olmalı");

         }else if(!mail.endsWith("@gmail.com")){
             System.out.println("mailde yazım hatası var");

         }

    }
}
