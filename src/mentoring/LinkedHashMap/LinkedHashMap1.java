package mentoring.LinkedHashMap;

import java.util.*;

public class LinkedHashMap1<milyon> {
    // todo

    public void main(String[] args) {


        LinkedHashMap<String, Integer> country = new LinkedHashMap<>();


        //TODO 5 TANE ULKE ISMI VE UNUFUSUNU  YAZI\
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();

        country.put("almanya", 82);
        country.put("turkiye", 80);
        country.put("rusya", 300);
        country.put("yunanistan ", 10);
        country.put("abd", 350);

        System.out.print(country);
        System.out.println("-------------------------------------");

        for (Map.Entry<String, Integer> ulke : country.entrySet()) {
            System.out.println(ulke);
        }
        System.out.println("-------------------------------------");

        System.out.println((country.keySet()));
        for (String str : country.keySet()) {

            System.out.println(str);

        }
        System.out.println("--------------------------------------------");

        System.out.println(country.values());
        for (Integer i : country.values()) ;
        System.out.println("--------------------------------------------");
        int sum = 0;
        for (Integer i : country.values()) {

            sum = sum + i;

        }
        System.out.println(sum);

        System.out.println("--------------------------------------------");

        int toplam = 0;
        for (Map.Entry<String, Integer> i : country.entrySet()) {

            int nufus = i.getValue();

            toplam = toplam + nufus;
        }
        System.out.println(toplam);

        System.out.println("--------------------------------------------");

        int count = 0;
        for (Map.Entry<String, Integer> i : country.entrySet()) {

            int nufus = i.getValue();
            if (nufus < 50_000_000) {
                count++;
                System.out.println(i.getKey());
            }

        }
        System.out.println(count);

    }}
