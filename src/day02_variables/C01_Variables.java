package day02_variables;

public class C01_Variables {


    public static void main(String[] args) {
        // bir variable olustururken icerisine koyacagim datanin alabilecegi degerlere uygun
        // bir data turu secmeliyiz
        // ornegin bir sehrin nufusundan bahsediyorsak
        // variable 'imizin data turu String, boolean, char veya double(virgullu) olamaz
        // geriye kalan tamsayi turlerinden sehrin nufusunu icine alabilecek buyuklukte bir data turu secebiliriz
        // biz kurs boyunca genelde tam sayılar icin int, ondalıklı sayilar icin double kullanacagiz


        System.out.println("Hello World yazdıran javayı halleder");

        int level=1;

        System.out.println(level);

        boolean ogrenciMi=true;

        boolean yagısVarmi=false;
        System.out.println(ogrenciMi);

        char ozelSembol='&';
        char sayi='2';
        char harf='K';

        System.out.println(sayi);


    }
}
