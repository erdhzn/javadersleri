package Gun322.Tasks.task1;

public class task2 {
    // 1. adim= ayri dsyada olmak uzere coastoumer isimli clas ac
    // 2. adim= ayri bir dosyada electricityAccount isimli ( fields totalKw, rate(double, bill)
    // 3. adim coustomer a bir ElectricityAccount ekleyiniz.
    // 4.adim= Custom 1 tane misteri olusturunuz Account u dahil
    // 5. adim= musteriye ait her ay tuketilen enerjiyi toplayacak bir metod yaziniz
    // tuketimEkle olsun  her verilen  aylik rakami toplayarak biriktirsin.
    // 6. adim= toplam tuketim ucretini rate ile carparak hedaplatiniz ve yazdiriniz 
    public static void main(String[] args) {
       // 4.adimda hem musteriyi hemde elektrik aboneliginin olusturduk.
        Coustomer musteri1= new Coustomer();
        musteri1. name= "Kaya";
        musteri1.electricityAccount= new ElectricityAccount();

        
        musteri1.electricityAccount.tuketimEkle(100);// ocak ayi
        musteri1.electricityAccount.tuketimEkle(150);//  subat  ayi

        System.out.println("musteri1.electricityAccount.totalKw = " + musteri1.electricityAccount.totalKw);

        System.out.println("musteri1.electricityAccount.totalBill() = " + musteri1.electricityAccount.totalBill());
    }
}
