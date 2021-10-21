package chapter5;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {

        int month = 4;
        String season;
        if (month == 12 || month == 1 || month == 2)
            season = "Winter";
        else if (month == 3 || month == 4 || month == 5)
            season = "Spring";
        else if (month == 6 || month == 7 || month == 8)
            season = "summer";
        else if (month == 9 || month == 10 || month == 11)
            season = "Autum";
        else
            season = "Bogus Month";


        System.out.println("Apil is in the " + season + ".");


        for (int i = 0; i < 6; i++) {
            switch (i) {
                case 0:
                    System.out.println("i is zero.");
                    break;
                case 1:
                    System.out.println("i is one");
                    break;
                case 2:
                    System.out.println("i is two");
                    break;
                case 3:
                    System.out.println("i is three");
                    break;
                case 4:
                    System.out.println("i is four");
                    break;
                default:
                    System.out.println("i is greater than four");
            }
        }


        for (int i = 0; i < 12; i++) {
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("i is less than 5");
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.println("i is less than 10");
                    break;
                default:
                    System.out.println("i is 10 or more");
            }
        }


        int monthOfYear = 4;
        String seasonofyear;
        switch (monthOfYear) {
            case 12:
            case 1:
            case 2:
                seasonofyear = "Witer";
                System.out.println("This month is in the " + seasonofyear);
                break;
            case 3:
            case 4:
            case 5:
                seasonofyear = "Spring";
                System.out.println("This month is in the " + seasonofyear);
                break;
            case 6:
            case 7:
            case 8:
                seasonofyear = "Summer";
                System.out.println("This month is is the" + seasonofyear);
                break;
            case 9:
            case 10:
            case 11:
                seasonofyear = "Autumn";
                System.out.println("This year is in the" + seasonofyear);
                break;
            default:
                seasonofyear = "Bogus Month";


        }


    }
}


