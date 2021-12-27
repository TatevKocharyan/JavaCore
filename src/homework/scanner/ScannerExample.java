package homework.scanner;

import homework.calculator.Calculator;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        boolean isRun=true;
        while(isRun) {

            System.out.println("Please input a number");
            int a = scanner.nextInt();
            System.out.println("Please input a number");
            int b = scanner.nextInt();


            boolean isWrongOperation = false;
            do {
                isWrongOperation = false;
                System.out.println("Pleass input  one of the arithmetic operators (*,/,+,-) or (0) for exit");

                String c = scanner.next();
                switch (c) {
                    case "+":
                        System.out.println(calculator.gumarum(a, b));
                        break;
                    case "/":
                        System.out.println(calculator.bajanum(a, b));
                        break;
                    case "-":
                        System.out.println(calculator.hanum(a, b));
                        break;
                    case "*":
                        System.out.println(calculator.bazmapatkum(a, b));
                        break;
                    case "0":
                        isRun=true;
                        break;
                    default:
                        isWrongOperation = true;
                        System.out.println("invalid operation");

                }
            } while (isWrongOperation);
        }

    }
}