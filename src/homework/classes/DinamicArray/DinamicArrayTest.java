package homework.classes.DinamicArray;

public class DinamicArrayTest {
    public static void main(String[] args) {

        DinamicArray da = new DinamicArray();
        for (int i = 0; i < 1000; i++) {
            da.add(i + 1);
        }
        da.print();

    }
}
