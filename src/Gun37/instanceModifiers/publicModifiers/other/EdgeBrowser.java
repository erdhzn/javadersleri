package Gun37.instanceModifiers.publicModifiers.other;

import Gun37.instanceModifiers.publicModifiers.same.SearchEngine;

public class EdgeBrowser {
    public static void main(String[] args) {

        // diger paketteki bu constructor a ulasti
        // cunku public
        SearchEngine microsoft= new SearchEngine("explorer");
        microsoft.name="Edge"; // diger paketteki bu fielda ulasabildim
    }
}
