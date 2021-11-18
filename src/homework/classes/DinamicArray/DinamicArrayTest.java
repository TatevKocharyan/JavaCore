package homework.classes.DinamicArray;

public class DinamicArrayTest {
    public static void main(String[] args) {

        DinamicArray da = new DinamicArray();
        for (int i = 0; i < 10; i++) {
            da.add(i + 1);
        }
        da.print();
        da.delete(4);
        System.out.println();
        da.print();
        System.out.println();
        da.set(5, 6);
        da.print();
        System.out.println();
        da.add(5,0);
        da.print();
    }
}
