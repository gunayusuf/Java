package day37_inheritance;

import day36_inheritance.Parent;

public class Child extends Parent {
    // bir classi child class yaptigimizda
    // parent classdaki constructor'a ulasmasi gerekir
    // bu durumda parent class'daki constructor'in
    // access modifieri uygun modifier yapilmalidir

    Child(){
        super();
        System.out.println("child class parametresiz cons");
    }
    Child(int s){
        // Child class'da tum constructorlarin ilk satirina
        // Javanin yerlestirdigi constructor PARAMETRESIZ dir yani super()

        System.out.println("Child class parametreli cons");
    }

    Child(int sayi1, int sayi2){
        //eger parent classdan parametresiz constructor'i degil de
        // baska bir constructor'i calistirmak isterseniz
        // bunu Child classdaki constructorin ILK satirina yazmalisiniz
        super(sayi1,sayi2);
        System.out.println("iki parametreli cons");
    }
    public static void main(String[] args) {
        Child child = new Child(5,8);
    }
}
