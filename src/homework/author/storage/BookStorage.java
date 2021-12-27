package homework.author.storage;

import homework.author.model.Author;
import homework.author.model.Book;
import homework.author.util.ArrayUtil;

public class BookStorage {
    Book[] books = new Book[10];
    int size = 0;

    //M
    public void add(Book book) {
        if (books.length == size) {
            extend();
        }
        books[size++] = book;
    }

    //M
    private void extend() {
        Book[] tmp = new Book[books.length + 10];
        System.arraycopy(books, 0, tmp, 0, books.length);
        books = tmp;
    }

    //M
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i] + " ");

        }
    }

    public Book getBySerialId(String serialId)  {
        for (int i = 0; i < size; i++) {
            if (books[i].getSerialId().equals(serialId)) {
               return books[i];

            }
        }return null;
    }


    public void searchBookByTitle(String keyword) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().contains(keyword)) {
                System.out.println(books[i]);

            }
        }
    }

    public void searchByAuthor(Author autor) {
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthor().equals(autor)) {
                System.out.println(books[i]);
            }

        }
    }

    public void countByAuthor(Author autor) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthor().equals(autor)) {
                System.out.println(books[i]);
            }
        }
        count++;
        System.out.println("count of" + autor.getEmail() + "authors book is" + count);


    }
    public void delete(Book book) {
        for (int i = 0; i < size; i++) {
            if (books[i].equals(book)) {
                ArrayUtil.deleteByIndex(books, i, size);
                break;
            }
        }
    }


    public void deleteByAuthor(Author author) {
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthor().equals(author)) {
                ArrayUtil.deleteByIndex(books, i, size);
            }
        }
    }





}
