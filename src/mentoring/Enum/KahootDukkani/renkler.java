package mentoring.Enum.KahootDukkani;

public enum renkler {

    KIRMIZI("DUR"),SARI("HAZIR OL"),YESIL("GEC");


    private  String kural;

    renkler(String kural){
        this.kural=kural;
    }
    public String getKural() {
        return this.kural;
    }

    public static void main(String[] args) {


        renkler[] tumRenkler= renkler.values();

      //  for (renkler renkleriYaz:tumRenkler){
         //   System.out.println("Renk:"+renkleriYaz.name()+"Kural :"+renkleriYaz.getKural());

        for (int i = 0; i <tumRenkler.length ; i++) {

            System.out.println("Renkler:"+ tumRenkler[i].name()+"kural:" + tumRenkler[i].getKural());
        }


        }
    }

