package day10_switchCase_StringManipulations;

import java.util.Scanner;

public class C02_SwitchStatements {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Gün numarası giriniz");
        int gunNo= scan.nextInt();

        switch(gunNo){
              case 1:
                System.out.println("Hafta içi");
                 break;
                case 2 :
                System.out.println("Hafta içi");
                    break;
                case 3 :
                System.out.println("Hafta içi");
                    break;
                case 4 :
                System.out.println("Hafta içi");
                    break;
                case 5 :
                System.out.println("Hafta içi");
                    break;
                case 6 :
                System.out.println("Hafta sonu");
                    break;
                case 7 :
                System.out.println("Hafta sonu");
            default :
                System.out.println("Gün numarası 1-7 arasında olmalıdır");

      /*
      İkinci çözüm:Scanner scan=new Scanner(System.in);

        System.out.println("Gün numarası giriniz");
        int gunNo= scan.nextInt();

        switch(gunNo){

              case 1:
              case 2 :
              case 3 :
              case 4 :
              case 5 :
                System.out.println("Hafta içi");
                    break;
               case 6 :
               case 7 :
                System.out.println("Hafta sonu");
            default :
                System.out.println("Gün numarası 1-7 arasında olmalıdır");

       */





        }
    }
 }
