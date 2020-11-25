package Gun24;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayList3 {
    public static void main(String[] args) {
        // Arraylist Collection grubuun bir elemani
        // Array i Collection metodlarini kullanacagiz

        ArrayList<Integer> numbers= new ArrayList<>();

        numbers.add(68);
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);

        System.out.println("Sirali degil ="+ numbers);
        Collections.sort(numbers);
        System.out.println("Sirali ="+numbers);

// EN BUYUK DEGERI BULUR
int max= Collections.max(numbers);
// EN KUCUK DEGRI BULUR
        int  min=Collections.max(numbers);

}}





