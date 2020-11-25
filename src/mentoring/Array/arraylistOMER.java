package mentoring.Array;

import java.util.ArrayList;
import java.util.Collections;

public class arraylistOMER {
    public static void main(String[] args) {
        /*

String arrayList oluşturun.

İçerisine Almanya, Italya , Türkiye , Yunanistan , Kanada ekleyin.

reverse   adında  void bir method oluşturun ve parametresi   String arrayList olsun.

Bu method, arrayListteki değerleri tersten sıralasın ve yazdırsın.

methodu çağırın.

Konsoldaki görüntü böyle olmalı:


ilk hali :   [Almanya, İtalya, Türkiye, Yunanistan, Kanada]
Tersten hali :   [Kanada, Yunanistan, Türkiye, İtalya, Almanya]

 */
        ArrayList<String> ulke = new ArrayList<>();
        ulke.add ("ALmanya");
        ulke.add ("Italya");
        ulke.add ("Kanada");
        ulke.add ("Yunanistan");
        System.out.println(" ilk hali:"+ ulke);
        reverse(ulke);

    }
    public static void reverse(ArrayList<String> ulke){
        Collections.reverse(ulke);
        System.out.println(ulke);


    }
}
