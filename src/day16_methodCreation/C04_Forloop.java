package day16_methodCreation;

public class C04_Forloop {
    public static void main(String[] args) {
        // verilen Stringi tersten yazdiran bir kod yaziniz


        String str ="Valla bu java cok zevkli";

        for ( int i = str.length()-1; i >=0 ; i--) {
            System.out.print(str.substring(i,i+1));
        }

    }
}
