package homework.author;

import java.util.Objects;

public class Book {
    private String serialId;
    private String title;
    private String description;
    private double price;
    private int count;
    Author author;

    public Book(String serialId,String title, String description, double price, int count,Author author) {
        this.serialId=serialId;
        this.title = title;
        this.description = description;
        this.price = price;
        this.count = count;
        this.author=author;
    }

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getSerialId() {
        return serialId;
    }

    public void setSerialId(String serialId) {
        this.serialId = serialId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Double.compare(book.price, price) == 0 && count == book.count && Objects.equals(serialId, book.serialId) && Objects.equals(title, book.title) && Objects.equals(description, book.description) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialId, title, description, price, count, author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "serialId='" + serialId + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", count=" + count +
                ", author=" + author +
                '}';
    }
}
