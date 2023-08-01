package day16_methodOluşturup_Kullanma;

public class C02_başkaClassdanMethodKullanma {
    public static void main(String[] args) {

      C01_MethodOluşturma.altString("Bu iş çok güzel",3,10);

      //C01_MethodOluşturma.altString('m',"ali",true);

        /*
        bir metod call sırasında yazdığımız değerlere ARGUMENT
        method deklarasyonundaki parantz içindeki variabl'lara PARAMETR denir

         public static void altString(String metin, int basIndex, int bitIndex )==>parametre
         C01_MethodOluşturma.altString('m',"ali",true);==>argüment

         String metin='m';
         int başIndex="ali";
         int bitIndex=true;

         argument'ler ile parametrele uyumlu olmazsa java CTE(altını kırmızı çizer) verir

         */
    }
}
