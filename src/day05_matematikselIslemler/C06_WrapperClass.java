package day05_matematikselIslemler;

public class C06_WrapperClass {
    public static void main(String[] args) {

        String str1="12345";
        String str2="23456";
        // verilen iki stringdeki sayilari toplayin

        System.out.println(str1 + str2); // 12345623456 yan yana yazdırır.
        System.out.println(Integer.valueOf(str1)+ Integer.valueOf(str2));

        // Integer.valueOf(str1) methodu sadece sayisal deger iceren Stringlerde kullanilabilir
        // bir tane bile sayi disinda karakter olursa java hata verir
    }
}
