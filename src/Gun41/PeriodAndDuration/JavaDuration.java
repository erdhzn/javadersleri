package Gun41.PeriodAndDuration;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class JavaDuration {
    public static void main(String[] args) {

        // prtiod= 2 tariharasinda gecen zamani yil ay gun olraka verirr


        LocalDate dt=LocalDate.of(1983,8,20);
        LocalDate bugun= LocalDate.now();

        Period fark= Period.between(dt,bugun);

        System.out.println("fark = " + fark);

        System.out.println("fark.getYears() = " + fark.getYears());
        System.out.println("fark.getMonths() = " + fark.getMonths());
        System.out.println("fark.getDays() = " + fark.getDays());

        System.out.println("fark.getYears() = " + fark.getYears() +"Yil, "+fark.getMonths()+" ay, "+fark.getDays()+" gun");
    }
}
