package Gun38.nonAccessModifier.finalModifier.Example2;

public class person {

        String name;
        final int fingerprintCode;

    public person(String name, int fingerprintCode) {
        this.name = name;
        this.fingerprintCode = fingerprintCode;
    }

    // final degiskenlerine ilk deger atama islemi direk yapilabildigi
    // gibi constructor la da atanabilir
    // ancak daha sonra yine degeri degistirelemez
    // bu islem ilk deger atama icin gecerlidri

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", fingerprintCode=" + fingerprintCode +
                '}';
    }
}

