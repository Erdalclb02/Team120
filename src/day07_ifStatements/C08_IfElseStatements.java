package day07_ifStatements;

import java.util.Scanner;

public class C08_IfElseStatements {

    public static void main(String[] args) {

        /*
        Soru-1 Kullanıcıdan bir üçgenin 3 kenar uzunluğunu alın
        ucgen eskenar ise “Eskenar ucgen” yazdirin,
         degilse “Eskenar degil” yazdirin.

         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("üçgenin kenar uzunluklarını giriniz ");
        double kenar1= scanner.nextDouble();
        double kenar2= scanner.nextDouble();
        double kenar3= scanner.nextDouble();

        if(kenar1==kenar2&& kenar2==kenar3&&kenar2>0) {
            System.out.println("Eşkenar Üçgen");
        }else{
            System.out.println("Eşkenar Ücgen Değil");}
        }

    }

