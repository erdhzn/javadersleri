package Gun322.Tasks.task1;

public class ElectricityAccount {
    int totalKw=0;
    double rate=0.7;
    double bill;
   void  tuketimEkle( int tuketim)
    {
        totalKw+= tuketim;
    }

         double totalBill(){
            bill= rate*totalKw;
       return bill;
    }
}
