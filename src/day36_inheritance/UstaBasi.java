package day36_inheritance;

public class UstaBasi extends Isci{



    public static void main(String[] args) {
        UstaBasi ustabasi1=new UstaBasi();
        ustabasi1.saatUcreti=15;
        ustabasi1.isim="Murat";
        ustabasi1.soyIsim="Gokcek";
        ustabasi1.maas=ustabasi1.maasHesapla();
        ustabasi1.statu="İsci";
        ustabasi1.isciStatu="Ustabasi";
        System.out.println(ustabasi1);

    }
    @Override
    public String toString() {
        return "UstaBasi{" +
                "isciStatu='" + isciStatu + '\'' +
                ", saatUcreti=" + saatUcreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", persNo=" + persNo +
                ", isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
