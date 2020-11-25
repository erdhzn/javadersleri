package Gun46.example.examples.ex1;

public class Kisi {

    String ad;
    String soyad;
  private int yas;

  public void setYas(int yas)
  {
     // 1. yontem

//      if (yas>0){
//      this.yas=yas;
//  }else
//      {
//          this.yas=-yas;
//      }



    this.yas= Math.abs(yas);
}
public int getYas()
{
    return this.yas;

}}