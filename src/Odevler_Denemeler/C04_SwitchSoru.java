package Odevler_Denemeler;

import java.util.Scanner;

public class C04_SwitchSoru {
    public static void main(String[] args) {
        // soru-1 Kullanicidan haftanin kacinci gunu oldugunu sorun ve gun ismini yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kacinci gün oldugunu giriniz");
        int gunSayi=scan.nextInt();
        switch (gunSayi) {
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Sali");
                break;
            case 3:
                System.out.println("Carsamba");
                break;
            case 4:
                System.out.println("Persembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Lutfen gecerli bir sayi giriniz");
        }
    }
}
