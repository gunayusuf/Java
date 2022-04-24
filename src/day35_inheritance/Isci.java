package day35_inheritance;

public class Isci extends Personel {
    public static void main(String[] args) {

        Personel objPers= new Personel();
        objPers.isim="Eren";
        objPers.soyIsim="Terzioglu";
        objPers.adres="Amsterdam";

        Isci objIsci= new Isci();
        objIsci.isim="Huseyin";
        objIsci.soyIsim="Efe";
        objIsci.adres="Ankara";

    }
}
