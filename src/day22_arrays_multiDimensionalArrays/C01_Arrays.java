package day22_arrays_multiDimensionalArrays;

public class C01_Arrays {

    public static void main(String[] args) {


        String [] isimler={"Ayşe", "Yusuf", "Buğra", "Abdullah", "Nergiz"};
        // verilen bir array'deki uzunlugu tek sayi olan isimleri
        // yan yana aralarinda bir bosluk birakarak yazdirin
        // en sonda alt satira gecerek toplam kac isim yazdirildigini yazdirin

        int sayaç=0;
        int kelimeUzunluğu=0;


        for (int i = 0; i < isimler.length ; i++) {

            kelimeUzunluğu= isimler[i].length();

            if (kelimeUzunluğu % 2 !=0){
                System.out.println(isimler[i]+" ");
                sayaç++;
            }


        }
        System.out.println("\n Toplam" + sayaç+ " adet isim yazdırıldı");




    }
}
