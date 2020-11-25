package mentoring.JUNITTEST.J;

import org.junit.Assert;
import org.junit.Test;

public class UNITTEST {
    // Assert.assertEquals
    @Test
    public void testLastChar(){
         main m=new main();
         char sonuc =m. lastCharacter("UNITTEST");
char beklenen ='T';

        //Assert.assertEquals(beklenen,sonuc);
        Assert.assertEquals( 'T',m.lastCharacter("UNITTEST"));

    }

    @Test
        public void testMaxNumber(){
        main m= new main();

        int[]arr={1,2,3,4,5,6,7,8,};
        int sonuc=m.maxNumberArray(arr);

        System.out.println("sonuc");

        Assert.assertEquals("metod hatali", 8,sonuc);


        }
        @Test
    public void faktoriyel(){
        main m=new main();
        int i=5;
        int sonuc=m.factorial(i);
        Assert.assertEquals(120, sonuc);

        }
       // @Test
   /* public void testDeneme(){
        String s1="Java";
        String s2="Java";
        boolean b=s1.equals(s2);

        Assert.assertTrue(b);*/

    boolean b1=true && false;
   // Assert.assertTrue(b1);
  //  Assert.assertFalse(b1);
        }

