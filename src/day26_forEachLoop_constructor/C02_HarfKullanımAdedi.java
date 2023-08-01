package day26_forEachLoop_constructor;

import java.util.Arrays;

public class C02_HarfKullanımAdedi {

    public static void main(String[] args) {

        /*
        Soru 4- Kullanicidan bir cumle ve bir harf alin,
         harf cumlede kullanilmissa kac kere kullanildigini yazdirin,
          kullanilmadiysa “harf cumlede kullanilmamis” yazdirin
         */
        
        String cumle="Java her geçen gün daha zevkli hale geliyor";
        String harf="a";
        
        String[] cumleArr=cumle.split("");
        
        int sayaç=0;
        for (String each:cumleArr
             ) {
            if (each.equals(harf)){
                sayaç++;
        }
        }
        if (sayaç==0){
            System.out.println("Aradığınız harf cümlede kullanılmamıştır");
        }else {
            System.out.println("Aradığınız '" + harf +"' cümlede " + sayaç + "kere kullanılmış. ");
        }
    }
}
