package Gun24;

public class JavaPrintAndFormat4 {
    public static void main(String[] args) {
        int a=120;
        double oran=0.2567864868;
        String str;
        System.out.println("a = " + a);
        System.out.println("oran = " + oran);

        // FORMATLI YAZDIRMALAR VE FORMAT VE PRINTF
        // TAM SAYIALR ICIN :D
        // ONDALIKLI SAYIALR ICIN f KULLANILIYOR
        str= String.format("a=%d  oran=%f",a,oran);
        System.out.println("1. str = " + str);
        System.out.println("a="+a+"oran="+oran);// ama ben noktadan sonra 2  hane yazsin gibi yazamandim

        System.out.printf("2. olarak a=%d oran=%f, pi=%f \n ", a,oran,Math.PI);
        System.out.printf("3. olarak a=%10d oran=%f \n ",a,oran); // 10 d 10 hane kullan
        System.out.printf("4. olarak a=%-10d oran=%f \n ",a,oran);// 10 d 10mhane kullan ama sola dayali basina - koy
        System.out.printf("5. olarak a=%010d oran=%f \n ",a,oran); // 10 d 10 hane kullan ama bos  yerlere 0 ata

        System.out.printf("6. a=%d oran=%.3f \n", a,oran); // noktadan sonra 3 hane kullan
        System.out.printf("7. a=%d oran=%.9f \n", a,oran); // noktadan sonra 9 hane kullan
        System.out.printf("8. a=%d oran=%6.1f \n", a,oran); // 6 hane kullan noktadan sonra 1 tane olsun
    }
    }

