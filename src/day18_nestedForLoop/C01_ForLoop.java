package day18_nestedForLoop;

public class C01_ForLoop {
    public static void main(String[] args) {

        // Kullanıcıdan 10 dan kucuk bir tamsayi isteyin
        // ve girilen sayinin faktoriyelini bulun (5!=5*4*3*2*1)

        int input = 9;
        int faktoryel=1;
        String faktoryelAcikYazim="";
        for (int i = input; i >=1 ; i--) {
            faktoryel *=i;
            if (i==input){
                faktoryelAcikYazim =faktoryelAcikYazim + i ;
            } else
                faktoryelAcikYazim =faktoryelAcikYazim +  "*" + i ;
        }
        System.out.println(input+"! = " + faktoryelAcikYazim + " =" + faktoryel);





    }
}
