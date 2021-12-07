package homework.author;


import homework.author.model.Author;
import homework.author.model.Book;
import homework.author.storage.AuthorStorage;
import homework.author.storage.BookStorage;
import homework.author.util.DateUtil;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class AuthorBookTest implements AuthorBookCommands {
    private static Scanner scanner = new Scanner(System.in);
    private static AuthorStorage authorStorage = new AuthorStorage();
    private static BookStorage bookStorage = new BookStorage();






    public static void main(String[] args) throws ParseException {
      authorStorage.add(new Author("poxos", "poxosyan", "poxos@gmail.com", 27, "male", DateUtil.stringToDate("12/05/1999")));
      authorStorage.add(new Author("petros", "petrosyan", "petros@gmail.com", 18, "male",DateUtil.stringToDate("04/05/2000")));
     authorStorage.add(new Author("gayane", "hakobyan", "gayane@gmail.com", 30, "female",DateUtil.stringToDate("11/10/1985")));
     bookStorage.add(new Book("ARM454545","Animal Farm", "Political", 10, 4, authorStorage.getByEmail("gayane@gmail.com")));
        Boolean isRun = true;
        while (isRun) {
            AuthorBookCommands.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_AUTHORS:
                    addAuthor();
                    break;
                case SEARCH_AUTHORS:
                    searchAuther();
                    break;
                case SEARCH_AUTHORS_BY_AGE:
                    searchAutherByAge();
                    break;
                case PRINT_AUTHORS:
                    authorStorage.print();
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case PRINT_BOOKS:
                    bookStorage.print();
                    break;
                case SEARCH_BOOKS_BY_TITLE:
                    searchBookByTitle();
                    break;

                case SEARCH_BOOKS_BY_AUTHOR:
                    searchBooksByAuthor();
                    break;
                case COUNT_BOOKS_BY_AUTHOR:
                    countBooksByAuthor();
                    break;
                case CHANGE_AUTHOR:
                    changeAuthor();
                    break;
                case CHANGE_BOOK_AUTHOR:
                    changeBookAuthor();
                    break;
                case DELETE_AUTHOR:
                    deleteAuthor();
                    break;
                case DELETE_BOOK:
                    deleteBook();
                    break;
                case DELETE_BOOK_BY_AUTHOR:
                    deleteBookByAuthor();
                    break;
                default:
                    System.out.println("Invalid command! ");
                    break;
            }
        }


        authorStorage.print();
        bookStorage.print();

    }

    private static void deleteBookByAuthor() {
        printAuthorsList();
        String email = scanner.nextLine();
        Author author = authorStorage.getByEmail(email);
        if (author != null) {
            bookStorage.deleteByAuthor(author);
        } else {
            System.err.println("Author does not exists");

        }
    }

    private static void deleteBook() {
        System.out.println("please choose book by serial id");
        System.out.println("--------");
        bookStorage.print();
        System.out.println("--------");
        String serialId = scanner.nextLine();
        Book book = bookStorage.getBySerialId(serialId);
        if (book != null) {
            bookStorage.delete(book);
        } else {
            System.err.println("Book with serial Id does not exists");
        }
    }

    private static void deleteAuthor() {
        printAuthorsList();
        String email = scanner.nextLine();
        Author author = authorStorage.getByEmail(email);
        if (author != null) {
            authorStorage.delete(author);
        } else {
            System.err.println("Author does not exists");

        }


    }

    private static void changeBookAuthor() {
        System.out.println("Please choose book's serialID");
        System.out.println("--------");
        bookStorage.print();
        System.out.println("--------");
        String serialid = scanner.nextLine();
        Book book = bookStorage.getBySerialId(serialid);
        if (book != null) {
            System.out.println("Please choose Authors email");
            System.out.println("--------");
            authorStorage.print();
            System.out.println("--------");
            String email = scanner.nextLine();
            Author autor = authorStorage.getByEmail(email);
            if (autor != null) {
                book.setAuthor(autor);
            } else {
                System.out.println("Author dose not exists");
            }

        } else {
            System.err.println("Book with that SerialId does not exists");
        }
    }

    private static void changeAuthor() {
        System.out.println("Please choose Authors email");
        System.out.println("--------");
        authorStorage.print();
        System.out.println("--------");
        String email = scanner.nextLine();
        Author author = authorStorage.getByEmail(email);
        if (author != null) {
            System.out.println("Please input author's name");
            String name = scanner.nextLine();
            System.out.println("Please input author's surname");
            String surname = scanner.nextLine();
            System.out.println("Please input author's age");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("Please input author's gender");
            String gender = scanner.nextLine();
            author.setName(name);
            author.setSurname(surname);
            author.setAge(age);
            author.setGender(gender);

        } else {
            System.err.println("Author dose not exists");
        }
    }

    private static void countBooksByAuthor() {
        System.out.println("Please choose Authors email");
        System.out.println("--------");
        authorStorage.print();
        System.out.println("--------");
        String email = scanner.nextLine();
        Author autor = authorStorage.getByEmail(email);
        if (autor != null) {
            bookStorage.countByAuthor(autor);
        } else {
            System.err.println("Author dose not exists");
        }


    }

    private static void searchBooksByAuthor() {
        System.out.println("Please choose Authors email");
        System.out.println("--------");
        authorStorage.print();
        System.out.println("--------");
        String email = scanner.nextLine();
        Author autor = authorStorage.getByEmail(email);
        if (autor != null) {
            bookStorage.searchByAuthor(autor);
        } else {
            System.err.println("Author dose not exists");
        }


    }


    private static void searchBookByTitle() {
        System.out.println("Please input a keyword");
        String keyword = scanner.nextLine();
        bookStorage.searchBookByTitle(keyword);
    }

    private static void printAuthorsList() {
        System.out.println("Please choose Authors email");
        System.out.println("--------");
        authorStorage.print();
        System.out.println("--------");

    }

    private static void addBook() {
        printAuthorsList();
        String email = scanner.nextLine();
        Author autor = authorStorage.getByEmail(email);
        if (autor != null) {
            System.out.println("Please input book's serialID");
            String serialId = scanner.nextLine();
            if (bookStorage.getBySerialId(serialId) != null) {


                System.out.println("Please input book's title");
                String title = scanner.nextLine();
                System.out.println("Please input book's description ");
                String description = scanner.nextLine();
                System.out.println("Please input book's price");
                double price = Double.parseDouble(scanner.nextLine());
                System.out.println("Please input count of the book");
                int count = Integer.parseInt(scanner.nextLine());
                Book bookInformation = new Book(serialId, title, description, price, count, autor);
                bookStorage.add(bookInformation);
                System.out.println("Thank you!The Information of the book was added");
            } else {
                System.err.println("Book with that SerialId" + serialId + "is exists");
            }
        } else {
            System.out.println("Invalid email! Please try again");
            addBook();
        }
    }


    private static void searchAutherByAge() {
        System.out.println("Please input Author's min age.");
        int minAge = Integer.parseInt(scanner.nextLine());
        System.out.println("Please input Author's max age");
        int maxAge = Integer.parseInt(scanner.nextLine());
        authorStorage.searchAuthorByAge(minAge, maxAge);
    }


    private static void searchAuther() {
        System.out.println("Please input a keyword.");
        String keyword = scanner.nextLine();
        authorStorage.searchAuthor(keyword);
    }


    /*Այս մեթոդի միջոցով ավելացնում ենք հեղինակների տվյալները, որոնք գրվում են կոնսոլում Scanner կլասի միջոցով։*/
    private static void addAuthor() throws ParseException {
        System.out.println("please input author's name,surname,email,gender,age,date of bith - 01/12/2012");
        String authorDataStr = scanner.nextLine();
        String[] authorData = authorDataStr.split(",");
        if (authorData.length == 6) {
            int age = Integer.parseInt(authorData[4]);
            Date date= DateUtil.stringToDate(authorData[5]);
            Author author = new Author(authorData[0], authorData[1], authorData[2],age, authorData[3],date);

            if (authorStorage.getByEmail(author.getEmail()) != null) {
                System.err.println("Invalid email. Author with this email already exists");
            } else {
                //authorStorage.add(author);
                System.out.println("Thank you, author was added");
            }
        } else {
            System.err.println("invalid data");
        }
    }}


