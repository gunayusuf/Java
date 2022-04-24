package day09_ternary_Switch;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {
        //ternary ile yapılan tüm işlemler if else ilede yapılabilir
        // if else yerine ternary tercih edilme sebebi yapının basit ve anlaşılır olmasıdır
        // ternary icerisinde kompleks kodlar olmaz
        // sadece sonuc veya bizi sonuca goturen basit islemler olabilir

        // kullanicidan bir tam sayi alip tek mi çift mi yazdıran bir kod yazalim

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int sayi=scan.nextInt();

        if (sayi%2==0){
            System.out.println("sayi çift");
        } else{
            System.out.println("sayi tek");
        }

        System.out.println(sayi%2==0 ? "Sayi cift":"sayi tek");

    }
}
