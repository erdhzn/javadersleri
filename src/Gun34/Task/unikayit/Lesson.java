package Gun34.Task.unikayit;

public class Lesson {
    String name;
    int hour;


    // return (dondurme) yoksa void vardir
   public  static  Lesson createLesson(String name, int hour){
        Lesson lesson = new Lesson();
        lesson.name=name;
        lesson.hour=hour;

        return lesson;
    }
}
