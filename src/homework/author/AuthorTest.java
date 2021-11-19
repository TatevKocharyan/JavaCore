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
            String b = scanner.next();
            System.out.println("Please input author's surname");
            String b1=scanner.next();
            System.out.println("Please input author's email");
            String b2=scanner.next();
            System.out.println("Please input author's age");
            int b3=scanner.nextInt();
            System.out.println("Please input author's gender");
            String b4=scanner.next();
            Author object=new Author(b,b1,b2,b3,b4);
            person.add(object);
        }

        person.print();



    }
}
// Տաթևիկ Քոչարյան tatevik0302@mail.ru 27 իգական