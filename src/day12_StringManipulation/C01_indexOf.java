package day12_StringManipulation;

public class C01_indexOf {
    public static void main(String[] args) {

        String str="Ali topu at, topu at ali";

        //ilk top metin parçasının index!ini yazdırın

        System.out.println(str.indexOf("top;" ));//4

        //2. top metin parçasının index 'ini yazdırın

        System.out.println(str.indexOf("top", 5));//13
        System.out.println(str.indexOf("top",str.indexOf("top") +1));

       //at kelimesinin 2 kere kullanılıp kullanılmadığını metne bakmadan bulun

        int ilkIndex=str.indexOf("at"); //ya -1 yada +1 olur
        if(ilkIndex==-1) { //hiç kullanılmamış
            System.out.println("2 kere kullanılmamış");
        }else {//en az 1 kere kullanılmış

            int ikinciIndex = str.indexOf("at", ilkIndex + 1);
            // -1 veya 2. defa kullanılmış ise doğal sayı olur
            if (ikinciIndex == -1) {//sadece   1 kere kullanılmış 2.kullanım yok

                System.out.println("2 kere kullanılmamış");
            } else {
                System.out.println("2 defa veya daha fazla kullanılmış");
            }


        }}}

