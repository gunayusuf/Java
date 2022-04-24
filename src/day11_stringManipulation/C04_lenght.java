package day11_stringManipulation;

import java.util.Locale;
import java.util.Scanner;

public class C04_lenght {
    public static void main(String[] args) {

        //kullanicidan ismini alip bas harfini ve son harfini
        // Buyuk harflerle yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim=scan.nextLine();

        System.out.println("ilk harf : " + isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(0));
        System.out.println("son harf : " + isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(isim.length()-1));

        String str1="";
        System.out.println(str1.length()); // 0

        String str2=null;
        System.out.println(str2.length());// kod calistirildiginda hata verir

        String str3;
        //System.out.println(str3);// javaya ben farkindayim null yazdir diyoruz
        // str3 ile str2 ye deger atanmamıstır
        // str2 null pointer ile isaretlendiginden java durumun kontrol altinda oldugunu bilir
        // ve geriye kalan kodun calismasina engel olmaz
        // ancak str3 e bir deger atamasi olmayinca java altini kirmizi cizer
        // ve bu durum düzeltilinceye kadar kodun geriye kalaninin calismasina da izin vermez

    }
}
