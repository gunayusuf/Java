package day09_ternary_Switch;

public class C03_Ternary {
    public static void main(String[] args) {

        int sayi=-140;
        // verilen sayinin 3 veya daha cok basamakli olup olmadıgını kontrol eden
        // ve sonucu yazdiran bir ternary olusturun

        String sonuc =sayi>=100 ? "Sayi 3 basamakli veya daha büyük" : "sayi negatif veya 3 basamaktan kucuk";

        //Ternary bize dondurdugu icin
        // ya bu sonucu direk yazdirmaliyiz
        //yada sonucun data turune uygun bir variable a atama yapabiliriz

        System.out.println("girdiginiz sayi analizi : " + sonuc);

    }
}
