package day06_concatenation_Operators;

public class C02_MantikOperatorleri {

    public static void main(String[] args) {

        System.out.println(5+2==8); // false

        boolean sonuc1= 5>4 && 7<9 && 6+3==9 && 5+2!=8 ; // true
        System.out.println(sonuc1);


        boolean sonuc2 = 5>4 && 7>9 && 6+3==9 && 5+2!=8; // false
        System.out.println(sonuc2);

         boolean sonuc3 = 5>4 & 7>9 & 6+3==9 & 5+2!=8;
        System.out.println(sonuc3);

        // && ile & arasindaki fark tek & daha fazla zaman harcar çift && false gördüğü zaman durur daha pratik


        int sayi3=15;
        // sayi 3'un 10 ile 20 arasinda oldugunu true olarak dondurelim
        // java uclu karsilastirma kabul etmez
        // ikili karsilastirmalar yapip mantiksal operatorlerle birlestirmeliyiz

        System.out.println(10<sayi3  && sayi3<20);

        int sayi4=5;
        //sayi 4 un 10 ile 20 arasinda olmadigini true ile dondurelim

        System.out.println(sayi4<10 || sayi4>20); // true

    }
}
