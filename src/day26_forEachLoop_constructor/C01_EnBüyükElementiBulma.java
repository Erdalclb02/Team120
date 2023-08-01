package day26_forEachLoop_constructor;

public class C01_EnBüyükElementiBulma {


    public static void main(String[] args) {


        //arry 'in enbüyük elementini bulunuz

        int[] arr = {3, 6, 9, 1, 3, 7, 12, 34, 23, 87, 32, 43};

        int enBüyükElement = arr[0];
        for (int each : arr
        ) {
            if (each > enBüyükElement) {
                enBüyükElement = each;
            }

        }
        System.out.println("Arry'deki en büyük element : " + enBüyükElement);


    }


}
