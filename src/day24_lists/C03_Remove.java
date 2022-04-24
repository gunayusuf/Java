package day24_lists;

import java.util.ArrayList;
import java.util.List;

public class C03_Remove {
    public static void main(String[] args) {

        List<Integer> sayilar= new ArrayList<>();
        sayilar.add(5); // [5]
        sayilar.add(3); // [5, 3]
        sayilar.add(0,7); // [7, 5, 3]
        sayilar.add(2,7); // [7, 5, 7, 3]

        sayilar.remove(3); // index olarak 3 deki elementi siler
        //sayilar.remove(5); // IndexOutOfBoundsException

        /*
        sayilardan olusan bir list'te objeyi vererek element silme methodu calismaz
        sayi degeri girdimizde Java otomatik olarak sayiyi İNDEX kabul eder.
         */

        //int sayi=5; // primitive oldugu icin olmadi
      //  sayilar.remove(sayi); //IndexOutOfBoundsException

        Integer sayi=5; // wrapperden non-primitive oldugu icin kabul etti.
        sayilar.remove(sayi);
        System.out.println(sayilar); // [7, 7]

    }
}
