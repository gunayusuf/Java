package day20_scope_Arrays;

public class C01_InstanceVariables {

    int sayi;
    String bransIsmi="Java";
    boolean okuldaMi;

    public static void main(String[] args) {

        //sayi=10;  sayi variable'ı static olmadıgı icin main methoddan direkt kullanilamaz
        // instance variable'lara static methodlardan ulasabilmek icin obje olusturmamiz gerekir


        C01_InstanceVariables obj1= new C01_InstanceVariables();
        System.out.println(obj1.sayi); // 0
        obj1.sayi=10;
        System.out.println(obj1.sayi);// 10
        obj1.bransIsmi="SQL";
        System.out.println(obj1.okuldaMi);// false


        C01_InstanceVariables obj2=new C01_InstanceVariables();
        System.out.println(obj2.sayi); // 0
        System.out.println(obj2.bransIsmi); // Java


        obj1.okuldaMi=true;
        System.out.println(obj2.okuldaMi);// false


    }
}
