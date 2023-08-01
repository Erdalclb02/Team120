package day20_arrays;

import java.util.Arrays;

public class C01_ArrayOluşturma {
    public static void main(String[] args) {

        int[] sayılar={2,4,6,7,8};


        String  harfler[]={"a","f","e"};

        System.out.println(sayılar[1]);//4

        System.out.println(harfler[2]);//e


        String[] öğrenciList={"Burhan","Ramazan","Samet","Şenol"};
        System.out.println(öğrenciList[1]);//Ramazan

        // 5 kişilik sınıf olıuşturun

        String[] sınıfListesi1={null,null,null,null,null};

        String []sınıfListesi2=new String[5];


        /*
        bir array oluştururken 2 şey mutlaka belirtilmelidir
        1-içime koulacak dataların türü
        2-Arry'in uzunluğu(Bir array'e oluşturulurken
        yazılan uzunluğundan daha fazla element konulamaz )

         */


        // bir Array 'in tümünü yazdırmak için
        System.out.println(sayılar);//

        // döngü ile yazdıralım

        for (int i=0 ; i< sayılar.length ; i++){
            System.out.println(sayılar[i] + " ");
        }// 2 4 6 7 8


       // Array'in tamamını yazdırmak için
       //Arrays class dan hazır method kullanırız

        System.out.println(Arrays.toString(sayılar));// [2 4 6 7 8]

        // for loop ile elementlerini yazdırırız
        //Arrays.toString() ise bize array'in kendisini yazdırır

        System.out.println(Arrays.toString(harfler));

        System.out.println(Arrays.toString(sınıfListesi1));// null null null null null

        System.out.println(Arrays.toString(sınıfListesi2));// null null null null null


        int [] notlar=new int[4];

        System.out.println(Arrays.toString(notlar));//[0,0,0,0]

        boolean[] blList=new boolean[8];
        System.out.println(Arrays.toString(blList));// [false,false,false,false,false,false,false,false]



    }
}
