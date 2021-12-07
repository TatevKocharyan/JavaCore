package homework.author;

public interface AuthorBookCommands {
     String EXIT = "0";
     String ADD_AUTHORS = "1";
     String SEARCH_AUTHORS = "2";
     String SEARCH_AUTHORS_BY_AGE = "3";
     String PRINT_AUTHORS = "4";
     String ADD_BOOK = "5";
     String PRINT_BOOKS = "6";
     String SEARCH_BOOKS_BY_TITLE = "7";
     String SEARCH_BOOKS_BY_AUTHOR = "8";
     String COUNT_BOOKS_BY_AUTHOR = "9";
     String CHANGE_AUTHOR = "10";
     String CHANGE_BOOK_AUTHOR = "11";
     String DELETE_AUTHOR = "12";
     String DELETE_BOOK = "13";
     String DELETE_BOOK_BY_AUTHOR = "14";


     static void printCommands() {
        System.out.println("Please input " + EXIT + " for EXIT");
        System.out.println("Please input " + ADD_AUTHORS + " for ADD_AUTHORS");
        System.out.println("Please input " + SEARCH_AUTHORS + " for SEARCH_AUTHORS");
        System.out.println("Please input " + SEARCH_AUTHORS_BY_AGE + " for SEARCH_AUTHORS_BY_AGE");
        System.out.println("Please input " + PRINT_AUTHORS + " for PRINT_AUTHORS");
        System.out.println("Please input " + ADD_BOOK + " for ADD_BOOK");
        System.out.println("Please input " + PRINT_BOOKS + " for PRINT_BOOK ");
        System.out.println("Please input " + SEARCH_BOOKS_BY_TITLE + " for SEARCH_BOOKS_BY_TITLE");

        System.out.println("please input " + SEARCH_BOOKS_BY_AUTHOR + " for SEARCH_BOOKS_BY_AUTHOR");
        System.out.println("please input " + COUNT_BOOKS_BY_AUTHOR + " for COUNT_BOOKS_BY_AUTHOR");
        System.out.println("please input " + CHANGE_AUTHOR + " for CHANGE_AUTHOR");
        System.out.println("please input " + CHANGE_BOOK_AUTHOR + " for CHANGE_BOOK_AUTHOR");
        System.out.println("please input " + DELETE_AUTHOR + " for DELETE_AUTHOR");
        System.out.println("please input " + DELETE_BOOK + " for DELETE_BOOK");
        System.out.println("please input " + DELETE_BOOK_BY_AUTHOR + " for DELETE_BOOK_BY_AUTHOR");
    }



}
