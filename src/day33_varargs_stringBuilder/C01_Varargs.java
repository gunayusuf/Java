package day33_varargs_stringBuilder;

public class C01_Varargs {
    public static void main(String[] args) {

        // Kac tane String verilirse verilsin
        // iclerinden en uzun olani yazdiran bir method olusturun
        String str1="Ali";
        String str2="Veli";
        String str3="Oguzhan";
        String str4="Samet";

        // Yazilan argument sayisi sabit ise her zamanki gibi bir method olusturabiliriz
        // ancak argument sayisinin degisme ihtimali varsa
        // o zaman varargs tercih edilir
        enUzunKelime(str1,str2,str3,str4);



    }//main sonu

    private static void enUzunKelime(String... str) {
        String enUzunStr="";

        for (String each: str
             ) {
            if (each.length()>enUzunStr.length()){
                enUzunStr=each;
            }
        }
        System.out.println("En uzun kelime : " + enUzunStr);
    }


}//Class sonu
