package day26_forEachLoop_constructor;

public class Araba {
    /* Java'da her class olusturudgumuzda
    Java o classdan ileride objeler uretmek gerekecegini bilir
    ve biz ozellikle belirtmesek de java
    her olusturdugu class'a bir constructor koyar

    Javanin class olustururken class'a koydugu constructor'a
    DEFAULT CONSTRUCTOR denir ve bu constructor gorunmez

    Eger biz gorunur bir constructorumuz olsun istersek
    default constructor ile ayni gorevi yapan bir constructor da olusturabiliriz
    veya istersek ayni kaliptan farkli desenlerde objeler olusturmak icin
    farkli ozelliklerde constructorlar da olusturabiliriz

    constructorlari birbirinden farklilastiran tek ayricalik
    kullanilan parametre sayisi ve parametre data turudur
     */

    public Araba(){
        System.out.println("parametresiz constructor calisti");
    }
    /*
     bir kod blogunun method veya constructor olmasindan emin olmak istiyorsaniz
     iki seye dikkat etmelisin
     1- Constructorların ismi class ismi ile AYNİ olmak ZORUNDADİR.(CLASS İSİMLERİ BUYUK HARFLE BASLAR)
     2- Constructorlarin return type'i olmaz

     ozetle : Constructor'in adi class adi ile ayni olmali ve
               return type'i olmamali
     */

    public Araba(String renk){
        System.out.println(renk + " renkli bir araba uretildi");
    }

    public  Araba(int yil){
        System.out.println(yil + " model bir araba uretildi");

    }

    public Araba(int yil, String renk){
        System.out.println(yil + " model " + renk + " renginde uretildi ");
    }
}





