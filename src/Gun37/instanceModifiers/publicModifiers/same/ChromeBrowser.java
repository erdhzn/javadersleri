package Gun37.instanceModifiers.publicModifiers.same;

public class ChromeBrowser {
    public static void main(String[] args) {

        // public oldugundan rahatlikla ulsabuliyorum ayni paket icinden

        SearchEngine google= new SearchEngine(" chrome");

        google.name= "Chrome";

        System.out.println("google = " + google);

        // toString metoduna gider o da public .

    }
    //
}
