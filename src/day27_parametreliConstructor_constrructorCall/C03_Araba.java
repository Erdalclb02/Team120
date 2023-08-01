package day27_parametreliConstructor_constrructorCall;

public class C03_Araba {
    String marka = "Marka belirtilmemiş";
    String model = "Model belirtilmemiş";
    int yıl = 1900;
    int fiyat;
    String renk = "Renk belirtilmemiş";
C03_Araba(){
    //Herhangi bir clas'a
}
 C03_Araba(String mrk,String mdl, int yli,int fyt,String rnk ){

 }


    public String toString() {
        return "C03_Araba{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", yıl=" + yıl +
                ", fiyat=" + fiyat +
                ", renk='" + renk + '\'' +
                '}';
    }


}
