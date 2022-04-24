package day50_maps;

import day49_maps.MapOlustur;

import java.sql.Array;
import java.util.*;

public class C01_Maps {

    public static void main(String[] args) {

        // siniftaki ogrenci listesini duzenli olarak yazdiralim

        Map<Integer,String> sinifListMap= MapOlustur.myMap();
        System.out.println(sinifListMap);
        /*
        Eger Keylere tek tek ulasmak istersek
        index yapisina ihtiyacimiz var
        ancak map index yapisini desteklemez
        bunun icin keyleri once bir set'e
        sonra da set'in tum elementlerini bir list'e ekledik
         */
        Set<Integer> sinifKeySeti = sinifListMap.keySet();
        List<Integer> keyList= new ArrayList<>();
        keyList.addAll(keyList);
        System.out.println(keyList.get(1));

        // Simdi de value'leri index ile ulasabilecegimiz bir sekle sokalim

        Collection<String> sinifValueColl =sinifListMap.values();
        System.out.println(sinifValueColl);

        List<String> sinifValueList = new ArrayList<>();
        sinifValueList.addAll(sinifValueColl);

        System.out.println(sinifValueList);

        /* her bir value birden fazla bilgiyi iceriyor
        onun icin valueleri multidimensional bir array'e atmak mantikli duruyor
        ancak MDA olusturmak icin boyutlari bilmeye ihtiyacimiz var

         */
        int outerArrayBoyut=sinifValueList.size();
        System.out.println(outerArrayBoyut);

        // inner arraylarin boyutunu bulmak biraz daha kompleks olacak

        String ilkValue=sinifValueList.get(0);
        System.out.println(ilkValue);

        String ilkValueArray[]=ilkValue.split(", ");
        int inerArrayBoyut=ilkValueArray.length;

        String valueMDArray[][]= new String[outerArrayBoyut][inerArrayBoyut];

        for (int i = 0; i <outerArrayBoyut ; i++) {
            String temp[] = sinifValueList.get(i).split(", ");
            for (int j = 0; j <inerArrayBoyut ; j++) {

               valueMDArray[i][j]=temp[j];

            }
        }

       /*
       bu satira kadar keyleri index ile ulasabildigim sinifKeylist'e atadim
       Valueleri valueMDArr'e atadim
       simdi bu key ve valueleri istedigim gibi manipule edebilirim
        */

        System.out.println("Numara  Isim  Soyisim  Brans");
        System.out.println("=============================");
        for (int i = 0; i <keyList.size() ; i++) {
            System.out.println(keyList.get(i)+"  ");
            for (int j = 0; j <inerArrayBoyut ; j++) {
                System.out.println(valueMDArray[i][j]+"  ");
            }
            System.out.println("");
        }
    }
}
