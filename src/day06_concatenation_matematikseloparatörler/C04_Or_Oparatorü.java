package day06_concatenation_matematikseloparatörler;

public class C04_Or_Oparatorü {


    public static void main(String[] args) {

        /*Or oparatorü iyimserdir
        yani tek bir true bile yeterli molur
        or oparatoründe tüm mantıksal mifadeler false ise sonuç false
        değilse sonuç true olur

         */
        System.out.println(3>5 || 6>4);//false || true==>true

        System.out.println(3<5|| 6>4);//true||true==>true

        System.out.println(3<5||6<4);//true || false==>true

        System.out.println(3>5 ||6>4);// false || false==>false



       int sayi=24;

        //sayi 3 'e veya 5'e bölünmelidir
        System.out.println(sayi%3==0 || sayi%5==0);//true || false==>true


//sayi 0 dan büyük 100 den küçük olmalıdır


        System.out.println(sayi>0 ||sayi<100);//true ||true==>true
        











    }

}
