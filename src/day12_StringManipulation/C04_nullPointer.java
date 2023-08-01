package day12_StringManipulation;

public class C04_nullPointer {
    public static void main(String[] args) {

     String str1;
       // System.out.println(str1);
        // str1.concat("candır");

     str1="Java";
        System.out.println(str1);//Java
        System.out.println(str1.concat("candır"));//Java candır

     /*
       null bir değer değil pointerdır(işartleyici)
       22.satır için
       str2'nin değeri null veya str2 değeri atanmışifadeleri YALNIŞTIR
       doğru olan ifade
       str2'ye değer atamadık bunun farkındayız ve null olarak işaretledik

      */
        String str2= null;
        System.out.println(str2);//null
        System.out.println(str2+ "candır");//null candır

        System.out.println(str2.concat("candır"));//NullPointerException

        str2="tava";
        System.out.println(str2);//tava
        System.out.println(str2.concat("candır"));//tava candır

         String str3= null;
         String str4= "";
        System.out.println(str4.isBlank());//true
        System.out.println(str4.isEmpty());//true

        //System.out.println(str3.isBlank());//NullPointerException
        //System.out.println(str3.isEmpty());//NullPointerException




    }
}
