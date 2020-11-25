package Gun27;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSetTreeSet4 {
    public static void main(String[] args) {
        // HahSet, LinkedHashSet, TreSet
        // Hash algoritmasina bagli siralmaya gore saklar
        HashSet<String> hs= new HashSet<>();
        hs.add("bir");
        hs.add("iki");
        hs.add("uc");
        hs.add("dort");
        hs.add("bes");
        System.out.println("hs = " + hs);
        // Eklem sirasina gore saklar
        LinkedHashSet<String> lhs= new LinkedHashSet<>();
        lhs.add("bir");
        lhs.add("iki");
        lhs.add("uc");
        lhs.add("dort");
        lhs.add("bes");

        System.out.println("lhs = " + lhs);
        // ALFABETIK SIRAYA GORE HER EKLEMEDE SAKLAR
        TreeSet<String>ts=new TreeSet<>();
        
        ts.add("bir");
        ts.add("iki");
        ts.add("uc");
        ts.add("dort");
        ts.add("bes");
        System.out.println("ts = " + ts);



        TreeSet<Integer>ts2=new TreeSet<>();

        // SAYISAL  SIRAYA GORE HER EKLEMEDE SAKLAR
        ts2.add(2);
        ts2.add(4);
        ts2.add(65);
        ts2.add(6);
        ts2.add(10);
        System.out.println("ts2 = " + ts2);

        
        
    }
}
