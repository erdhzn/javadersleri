package Gun7;

public class StringConcat {

    public static void main(String[] args) {
        // bir stringe digerioni ekler
        String s=" hi";
        System.out.println(s+" there!"); // hi there!
        System.out.println(s.concat(" there!")); // hi there!

    String s2 = " everybody";
        System.out.println(s.concat(s2));
        System.out.println("s = " +  s);
        
        s= s.concat(s2);// degiskenin kendine atarsam degeri degisir .
        System.out.println("s = " +  s);
    
    }
    
}
