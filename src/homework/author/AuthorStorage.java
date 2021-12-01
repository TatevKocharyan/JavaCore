package homework.author;

public class AuthorStorage {
    private Author[] authors = new Author[10];
    private int size = 0;

    //M
    public void add(Author author) {
        if (authors.length == size) {
            extend();
        }
        authors[size++] = author;
    }


    //M
    private void extend() {
        Author[] tmp = new Author[authors.length + 10];
        System.arraycopy(authors, 0, tmp, 0, authors.length);

        authors = tmp;
    }

    //M
    public Author getByIndex(int index, Author author) {
        if (index < 0 || index > size) {
            System.err.println("OutOfBounderies");
            return null;
        }
        return authors[index];
    }

    //M
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(authors[i] + " ");
        }
    }


    public void searchAuthor(String keyword) {
        for (int i = 0; i < size; i++) {
            if (authors[i].getName().contains(keyword) ||
                    authors[i].getSurname().contains(keyword)) {
                System.out.println(authors[i]);


            }
        }
    }

    public void searchAuthorByAge(int minAge, int maxAge) {
        for (int i = 0; i < size; i++) {
            if (authors[i].getAge() >= minAge &&
                    authors[i].getAge() <= maxAge) {
                System.out.println(authors[i]);
            }

        }
    }

    public Author getByEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (authors[i].getEmail().equals(email)) {
                return authors[i];
            }
        }
        return null;
    }

    public void delete(Author author) {
        for (int i = 0; i < size; i++) {
            if (authors[i].equals(author)) {
                ArrayUtil.deleteByIndex(authors, i, size);
                size--;
                break;
            }
        }
    }
}
