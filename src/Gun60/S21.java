package Gun60;

public class S21 {

    public static void main(String[] args) {

        int[] arr={1,2,3,4};
        int i=0;
        do {
            System.out.print(arr[i]+" "); //i => 0,1,2,3,4
            i++;
        }while (i < arr.length + 1 );//  5 sinir omus oluyor yani 4 noliu ondexteki elemani yazmaya calisiyor.

    }
}

// 1 2 3 4 Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
