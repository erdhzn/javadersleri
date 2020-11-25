package Gun38.nonAccessModifier.finalModifier.Example;

public class Ex1 {
    private static Constans Constants;

    public static void main(String[] args) {

        // bir dairenin alanini pi*r*r dir
         int yaricap=4;
         double alan= 4*4*Constans.pi;


         // kullanicidan alacaginiz saat , dakika ve gun bilgisinin saniyeyey ceviriniz

        int gun =23;
        int saat=7;
        int dakika=25;

              int saniyeCinsinden =
                gun * Constants.hourInDay *Constants.minuteInHour* Constants.secondInMinute+
                        saat* Constants.minuteInHour* Constants.secondInMinute+
                        dakika * Constants.secondInMinute;
        System.out.println("saniyeCinsinden = " + saniyeCinsinden);


    }

}
