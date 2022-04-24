package day30_passByValue;

public class C01_StaticBlocks {

    static{// static block class ilk calismaya basladiginda devreye girer ve class'in calismasi icin
        // gerekli on hazırlık icin kullanilir
        // yazildigi satirin hicbir onemi yoktur,class icerisinde istenen yerde yazilabilir
        //static block 1 den fazla olursa blocklar yukaridan asagi dogru sirayla calisir

        System.out.println("static block1 calisti(mainden once)");
    }
    static {
        System.out.println("static block2 calisti");
    }

    C01_StaticBlocks(){
        System.out.println("constructor calisti");
    }


    public static void main(String[] args) {
        System.out.println("main method baslangici");

        C01_StaticBlocks obj1;
        new C01_StaticBlocks();





    }//main sonu
}//clas sonu
