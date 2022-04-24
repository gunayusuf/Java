package Odevler_Denemeler;

import java.util.Scanner;

public class C05_SwitchSoru5 {
    public static void main(String[] args) {
        //Kullanicidan SDET kisaltmasindaki harflerden birini yazmasini isteyin
        //Kullanici
        //S girerse “
        //D
        //girerse “
        //E
        //girerse “
        //T
        //girerse “In Testing” yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("S,D,E,T harflerinden birini yaziniz");
        char harf=scan.next().toUpperCase().charAt(0);
        switch (harf) {
            case 'S':
                System.out.println("Software");
                break;
            case 'D':
                System.out.println("Developer");
                break;
            case 'E':
                System.out.println("Engineer");
                break;
            case 'T':
                System.out.println("In Testing");
                break;
            default:
                System.out.println("Lutfen gecerli bir harf giriniz");


        }
    }
}
