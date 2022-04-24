package Odevler_Denemeler;

import java.util.Scanner;

public class C03_Deneme3 {
    public static void main(String[] args) {
        //Soru 1 )
        //byte veri tipinde bir degisken olusturun, short,int,float ve double data tiplerinde
        //birer degisken olusturup adim adim widening yapin ve yazdirin
        //Soru 2 )
        //int veri turunde bir degisken olusturun ve adim adim narrowing yapin ve yazdirin
        //Soru 3 )
        //Float data turunde bir variable olusturun ve yazdirin
        //Soru 4 )
        //double 255.36 sayisini int’a ve sonra da olusturdugunuz int sayiyi byte’a cevirip
        //yazdirin
        //Soru 5 )
        //int 2 sayiyi birbirine boldurun ve sonucu yazdirin
        //Soru 6 )
        //int bir sayiyi double bir sayiya bolun ve sonucu yazdirin
        //Soru 7 )
        //Farkli data tipleri ile islem yapip, sonuclarini yazdiralim

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 4 basamakli sayi giriniz");
        int sayi=scan.nextInt();
        int rakam=0;
        int rakamlarToplami=0;

        rakam=sayi%10;
        rakamlarToplami +=rakam;
        sayi/=10;

        rakam=sayi%10;
        rakamlarToplami +=rakam;
        sayi/=10;

        rakam=sayi%10;
        rakamlarToplami +=rakam;
        sayi/=10;

        rakam=sayi%10;
        rakamlarToplami +=rakam;
        sayi/=10;

        System.out.println("girdiginiz sayinin rakamlar toplami : " +rakamlarToplami);




    }
}
