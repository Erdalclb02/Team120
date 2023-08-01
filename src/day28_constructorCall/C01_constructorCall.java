package day28_constructorCall;

public class C01_constructorCall {

    C01_constructorCall(){
        System.out.println("Parametresiz constructor çalıştı");
    }

    C01_constructorCall(String str){
        C01_constructorCall(4);//method call
        System.out.println("String parametreli constructor çalıştt" +
                "ı");
    }
    C01_constructorCall(int a){
        System.out.println("int parametreli constructor çalıştı");
    }

    void   C01_constructorCall(int sayı){
        System.out.println("int parametreli constructor çalıştı");
    }

    public static void main(String[] args) {
        C01_constructorCall obj =new C01_constructorCall();

        System.out.println("Merhaba tekrardan github");
    }
}

