package Gun33.Task2;

import java.util.ArrayList;

public class Student {
    String name ;
    int maxCredit;
    ArrayList<lesson> lessonList;

    public int totalCredit()
    {

        int total=0;
        for (lesson ders: lessonList)
        {
            total+=ders.credit;
        }

        return total;
    }



}
