package Gun11;

import java.util.Scanner;

public class IfElseLogic {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //girilwn bir stringin uzunlupu 10 dan buyukse ve string icinde
        // ''study yazdirin . degilse hayir yazdirin
        System.out.println("Bir cumle giriniz :");
        String text = sc.nextLine();
        if (text.length() > 10 && text.contains("study")) {
            System.out.println("Evet");}

            else{
                System.out.println("Hayir");

        }
    }

}