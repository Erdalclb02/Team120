package day26_forEachLoop_constructor;

public class C07_Runner {

    public static void main(String[] args) {

        C04 obj;
        //deklerasyon vardır ama ete kemiğe bürünmüş bir obje yoktur

        new  C04();
        //objeyi oluşturduk ama sonraki satırlarda kullanamayız
        //çünkü bir objeye atayamadık

        System.out.println(new C04().sayı);//10

        C04 obj2 =new C04();



    }
}
