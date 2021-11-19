package homework.author;

public class AuthorStorage {
    private Author[] array;
    private int size = 0;

    //M
    public void add(Author author) {
        if (array.length == size) {
            extend();
        }
        array[size++] = author;

    }

    //M
    private void extend() {
        Author[] tmp = new Author[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i];
        }
        array = tmp;
    }

    //M
    public Author getByIndex(int index, Author author) {
        if (index < 0 || index > size) {
            System.err.println("OutOfBounderies");
            return null;
        }
        return array[index];
    }

    //M
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }


}
