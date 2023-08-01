package day09_NestedIfElseStatements_Ternary;

import java.util.Scanner;

public class C07_Ternary {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz");

         double sayı= scanner.nextDouble();

         System.out.println(sayı>0 ? sayı : -1*sayı);




    }


}
