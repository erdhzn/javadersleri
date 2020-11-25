package mentoring.encapsulation.Student;

public class mainstudent {
    public static void main(String[] args) {
        student student1= new student();
        // set student
        student1.setStudentRoll(1);
        student1.setStudentName("Alex");
        student1.setStudentAge(35);


        // display (ekranda goruntukeme

        System.out.println(" ogrencinin kayir numarasi : "+ student1.getStudentRoll());
        System.out.println("ogrencinin adi :"+ student1.getStudentName());
        System.out.println("ogencinin yasi :"+ student1.getStudentAge());
    }
}
