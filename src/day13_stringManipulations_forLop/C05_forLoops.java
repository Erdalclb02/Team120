package day13_stringManipulations_forLop;

public class C05_forLoops {
    public static void main(String[] args) {
      //kullanıcının verdiği sayıdan başlayıp
        //ardışık 10 tamsayı yazdırın

        int input=40;

        for (int i = 8; i <input+10; i++) {
            System.out.print(i+"");

        }
        System.out.println();
        //kullanıcını vrdiği sayıdan başlayın
        // 100 kadar(100dahil) 5'er 5'er arttırarak yazdırın

        for (int i = input; i <=100 ; i+=5) {
            System.out.print(i+" ");
        }

        System.out.println();
        //100 den başlaıp 1'e kadar geri geri gidin
        // 7'nin katı olan sayıları yazdırın

        for (int i = 100; i >=1; i--) {

            if(i%7==0){
                System.out.print(i+" ");
            }

        }

    }
}
