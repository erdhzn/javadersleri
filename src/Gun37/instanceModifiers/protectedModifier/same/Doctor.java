package Gun37.instanceModifiers.protectedModifier.same;

public class Doctor {

    protected String ad;
    protected  Doctor(){


    }

    public Doctor(String ad) {
        this.ad = ad;
    }
    protected void print ()
    {
        System.out.println("ad="+ad);

    }
}
