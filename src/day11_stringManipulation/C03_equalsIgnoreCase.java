package day11_stringManipulation;

import java.util.Scanner;

public class C03_equalsIgnoreCase {
    public static void main(String[] args) {

        //kullaniciya derse katilip katilmak istemedigini sorun
        // evet derse cevabini ve katiliminiz alinmistir yazdirin
        // hayir derse cevabini ve sonraki derslerimize bekleriz yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Derse katilmak ister misiniz ? \n Evet veya Hayir yaziniz");
        String cevap=scan.next();

        if (cevap.equalsIgnoreCase("evet")){
            System.out.println("Cevabiniz : " + cevap +" Derse katiliminiz onaylanmistir");
        } else if (cevap.equalsIgnoreCase("hayir")){
            System.out.println("Cevabiniz : " + cevap + " Sonraki derslere bekleriz" );
        }else{
            System.out.println("Lutfen evet veya hayir yaziniz");

        }


    }
}
