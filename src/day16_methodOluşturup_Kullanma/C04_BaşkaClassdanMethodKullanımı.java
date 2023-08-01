package day16_methodOluşturup_Kullanma;

public class C04_BaşkaClassdanMethodKullanımı {
    public static void main(String[] args) {

      C01_MethodOluşturma.altString("Method",1,3);//et

        System.out.println(C03_MethodOluşturma.isimDuzenle("buğra", "Kavak"));//Buğra Kavak


                String isimDuzenli = C03_MethodOluşturma.isimDuzenle("mehmet","kemal");

                // duzenlenis ismin uzunlugunu yazdirin
                System.out.println(isimDuzenli.length());

      /*
        Void olan method'da sonucu KAYDEDEMEYIZ, sadece yazdiririz

        bize deger DÖNDÜREN method'da ise sonucu
        istersek direk yazdirir, istersek de kaydederiz
       */
            }
        }



