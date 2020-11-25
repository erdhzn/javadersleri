package Gun33.Task2;

public class lesson {
    String name;
    int credit;

    public static lesson createLesson(String name, int credit)
        {
        lesson ders = new lesson();
                ders.name=name;
                ders.credit=credit;

                return ders;

    }

}

