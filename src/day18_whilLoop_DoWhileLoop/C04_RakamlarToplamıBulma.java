package day18_whilLoop_DoWhileLoop;

import java.util.Scanner;

public class C04_RakamlarToplamıBulma {

    public static void main(String[] args) {

        //Soru 2- While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun


        Scanner scanner=new Scanner(System.in);

        System.out.println("Lütfen rakamlar toplamını bulmak istediğiniz sayıyı yazdırın");

        int girilenSayı=scanner.nextInt();


        int sayı=girilenSayı;
        int birlerBasamağı=0;
        int rakamlarTolamı=0;

        while(sayı>0){

            birlerBasamağı=sayı%10;
            rakamlarTolamı+= birlerBasamağı;
            sayı/=10;

        }
        System.out.println("girilen" + girilenSayı +" nin rakamlar toplamı:" + rakamlarTolamı);


    }



}
