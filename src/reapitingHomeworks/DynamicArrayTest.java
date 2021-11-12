package reapitingHomeworks;

public class DynamicArrayTest {
    public static void main(String[] args) {
        DynamicArray dy = new DynamicArray();
        for (int i = 0; i < 100; i++) {
            dy.add(i + 1);

        } dy.print();

        System.out.println(dy.GetByIndex(8));

        dy.add(10);
        dy.add(10);
        dy.add(10);
        dy.add(10);
        dy.add(10);
        dy.add(10);
        dy.add(10);
        dy.add(10);
        dy.add(10);
        dy.add(10);
        dy.add(10);
        dy.add(10);
        dy.add(20);
        dy.print();

        dy.add(5);
        dy.add(5);
        dy.add(5);
        dy.add(5);
        dy.add(5);
        dy.add(5);
        dy.print();
    }

}
