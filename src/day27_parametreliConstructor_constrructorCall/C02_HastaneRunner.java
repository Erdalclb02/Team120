package day27_parametreliConstructor_constrructorCall;

public class C02_HastaneRunner {
    public static void main(String[] args) {


                C01_Hastane personel1 = new C01_Hastane();

                System.out.println(personel1.personelİsim); // isim atanmadi
                System.out.println(personel1.personelTelefonu); // tel atanmadi
                System.out.println(personel1.hastaneAdı); // Yildiz Hastanesi
                System.out.println(personel1.hastaneTelefon); // 03122456754

                personel1.personelTelefonu = "5552342323";
                personel1.personelİsim = "Mertkan";


                C01_Hastane personel2 = new C01_Hastane();
                System.out.println(personel2.personelİsim); // isim atanmadi
                System.out.println(personel2.personelTelefonu); // tel atanmadi

            }
        }

