package day19_doWhileLoop;

public class C05_Scope {
    // 1-   bir method icerisinde olusturulan variablelar sadece olusturulduklari
    //      methodda kullanilabilirler baska methodlarda kullanilamazlar
    // 2-   Tum methodlarin kullanabilmesini istedigimiz variablelari
    //      Class levelda olustururuz
    //      Class levelda olusturdugumuz variable ı static yaparsak tum methodlar kullanabilir
    //      Static olmazsa(instance) o zaman sadece static olmayan methodlar kullanabilir
    //  3-  Loop icinde olusturulan variablelar loop icinde kullanilabilir
    //      ama loopun dışında kullanilamaz


    static String kurs="Java";
    int level=10;
    //static int sayi4=;
    
    
    public static void main(String[] args) {
        
        
        int sayi=10;
        System.out.println(kurs);
        //System.out.println(level);

        for (int i = 0; i <10 ; i++) {
            System.out.println(i);
            int loopSayi=20;
        }
        //System.out.println(i);
        //System.out.println(loopSayi);

        //int sayi2=;

        //sayi4++;// class seviyesinde olusturup deger atamadıgım sayi4 u artirmama java itiraz etmiyor
       // sayi2++;// ama main method icinde olusturup deger atamadigim sayiyi artirmama java izin vermiyor
    }
    
    public static void method1(){
        String isim="Ali Can";
        System.out.println(kurs);
        //System.out.println(level);
    }
    
    public void method2() {
        System.out.println(kurs);
        System.out.println(level);
    }
    
    
    
    
    
}
