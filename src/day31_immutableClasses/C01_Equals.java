package day31_immutableClasses;

public class C01_Equals {

    public static void main(String[] args) {

        String str1 = "Eren";
        String str2 = "Eren";
        String str3 = new String("Eren");
        String str4 = str1 + "";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equals(str4));
        System.out.println(str1==str2);
        System.out.println(str1==str4);
        System.out.println(str1==str4);

    }
}
