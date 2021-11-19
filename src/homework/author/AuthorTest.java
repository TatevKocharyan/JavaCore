package homework.author;


import java.util.Scanner;

public class AuthorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("How many authors do you have?");
        System.out.println("Please input your number");
        int a = scanner.nextInt();
        AuthorStorage person = new AuthorStorage();
        for (int i = 0; i < a; i++) {
            System.out.println("Please input information about the author");
            String b = scanner.next();
        }



    }
}
