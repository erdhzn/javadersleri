package Gun54.Task.soru;

public class soru {
    interface  Animal{
        public String food();

    }
    interface Flying extends Animal{
        public String flying();
    }
    interface Sailing extends Animal{
        public String swimming();
    }
    class swallow implements Flying{
        public String flying(){
            System.out.println("kirlangic ucar");
            return "kirlangic ucar";
        }
        public String food(){
            System.out.println("kirlangic simit yer");
            return "kirlangic simit yer";

        }
    }
    class Cat implements Animal{
        public String food(){
            System.out.println("kedi mama yer");
            return "kedi mama yer";
        }

    }
    class Shark implements Sailing{
        public String swimming(){
            System.out.println("Kopekbaligi yuzer");
            return "Kopekbaligi yuzer";
        }
        public String food(){
            System.out.println("Kopekbaligi insan yer");
            return "Kopekbaligi insan yer";

        }

    }
    static class Duck implements Flying,Sailing{
        public String flying(){
            System.out.println("ordek ucar");
            return "ordek ucar";
        }
        public String swimming(){
            System.out.println("ordek yuzer");
            return "ordek yuzer";
        }
        public String food(){
            System.out.println("ordek balik yer");
            return "ordek balik yer";

        }


    }

    public static class interface1 {
        public static void main(String[] args) {
            Duck ordek=new Duck();
            ordek.flying();
            ordek.swimming();
            ordek.food();
        }

    }
}
