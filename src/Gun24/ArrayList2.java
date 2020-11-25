package Gun24;

import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> list1= new ArrayList<>(){
            {
                add("almanca");
                add("ingilizce");
                add("turkce ");
                add("rusca");
            }
        };
        System.out.println("list1 = " + list1);

        ArrayList<String> list2= new ArrayList<>();
        list2.add("rusca");
        list2.add("turkce");
        list2.add("arapca");
        System.out.println("list2 = " + list2);

        list1.removeAll(list2);
        System.out.println("list1 = " + list1);
    }
}
