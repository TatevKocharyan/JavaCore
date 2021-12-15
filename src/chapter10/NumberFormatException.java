package chapter10;

import java.util.Scanner;

public class NumberFormatException {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        boolean isRun = true;
        while (isRun) {
            System.out.println("Please input number");
            String str = scanner.nextLine();
            int number = meth(str);
            System.out.println(number);
            if (number == 0) {
                System.out.println("Please try another number");

            }
        }
    }

   /* static int meth(String numberstr) {
        try {
            return Integer.parseInt(numberstr);
        } catch (Throwable e) {
            System.out.println("Number format i wrong");
            return 0;
        }*/

    static int meth(String numberstr) throws Exception {
        return Integer.parseInt(numberstr);
    }

}




