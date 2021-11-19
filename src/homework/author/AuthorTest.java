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
            System.out.println("Please input author's name");
            String name = scanner.next();
            System.out.println("Please input author's surname");
            String surname=scanner.next();
            System.out.println("Please input author's email");
            String email=scanner.next();
            System.out.println("Please input author's age");
            int age=scanner.nextInt();
            System.out.println("Please input author's gender");
            String gender=scanner.next();
            Author authorinformation  =new Author(name,surname,email,age,gender);
            person.add(authorinformation);
        }

        person.print();



    }
}
// Տաթևիկ Քոչարյան tatevik0302@mail.ru 27 իգական