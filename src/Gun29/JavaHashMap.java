package Gun29;

import java.util.HashMap;
import java.util.Map;

public class JavaHashMap {

    public static void main(String[] args) {

        Map<Integer,Integer> m= new HashMap<>();
        m.put(2,11);//
        m.put(3,12);
        m.put(4,13);
        m.put(2,14);

        System.out.println(".get(2) = " +m.get(2));

        // 2. yintemmler
         for (Integer key:m.keySet())
         {
             System.out.println("key = " + key);
         }
         for (Integer  vl:m. values()){

             System.out.println("vl = " + vl);

         }
         for(Map.Entry<Integer,Integer>anahtarVeDeger: m.entrySet()) {
             System.out.print("anahtarVeDeger.getKey() = " + anahtarVeDeger.getKey()); // bu anahtarı veriyor
             System.out.print(",  anahtarVeDeger.getValue() = " + anahtarVeDeger.getValue()); // bu ise değeri veriyor
             System.out.println();
         }
             boolean buAnahtarVarMi = m.containsKey(2); // 2 şeklinde bir anahtar var mı ?
             boolean buDegerVarMi = m.containsValue(12); // 12 değeri var mı?

             System.out.println("buAnahtarVarMi = " + buAnahtarVarMi);
             System.out.println("buDegerVarMi = " + buDegerVarMi);

             m.remove(2);
             System.out.println("remove 2 den sonra m = " + m);

             m.clear();
             System.out.println("clear den sonra m = " + m);
         }
    }

