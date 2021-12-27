package chapter12;

import java.util.Scanner;

public class LangTest {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Lang lang = Lang.ENG;
        lang = Lang.ARM;
        System.out.println(lang);
        Lang[] langs = Lang.values();
        for (Lang value : langs) {
            System.out.print(value + " ");
        }

        System.out.println(Lang.ENG.compareTo(Lang.RU));


        System.out.println("Choose language");
        String lang1 = scanner.nextLine();

       try {
           Lang userlang=Lang.valueOf(lang1.toUpperCase());
           System.out.println(userlang);
           System.out.println(userlang.getCountryName());
           System.out.println(userlang.ordinal());
       }catch (IllegalArgumentException e){
           System.out.println(e.getMessage());
       }

    }

}
