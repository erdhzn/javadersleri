package Gun54.Task.soru;

public class soru2 {

    interface ReadFile{
        String open();
        String read();
        String save();
        String close();

    }
    class TxtFile implements ReadFile {
        public String open(){
            return"opening.txt";
        }
        public String read(){
            return "reading.txt";
        }
        public  String save(){
            return"saving.txt";
        }
        public String close(){
            return"closing.txt";
        }

    }
    class PowerPointFile implements ReadFile {
        public String open(){
            return"opening.ppt";
        }
        public String read(){
            return "reading.ppt";
        }
        public  String save(){
            return"saving.ppt";
        }
        public String close(){
            return"closing.ppt";
        }

    }
    class DMGFile implements ReadFile {
        public String open(){
            return"opening.dmg";
        }
        public String read(){
            return "reading.dmg";
        }
        public  String save(){
            return"saving.dmg";
        }
        public String close(){
            return"closing.dmg";
        }

    }
    static class EXEFile implements ReadFile {
        public String open(){
            return"opening.exe";
        }
        public String read(){
            return "reading.exe";
        }
        public  String save(){
            return"saving.exe";
        }
        public String close(){
            return"closing.exe";
        }

    }

    public static class interface2 {
        public static void main(String[] args) {
            EXEFile program=new EXEFile();
            System.out.println(program.open());
            System.out.println(program.close());
            System.out.println(program.read());
            System.out.println(program.save());
        }


    }

}
