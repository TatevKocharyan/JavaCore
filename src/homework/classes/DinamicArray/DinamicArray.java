package homework.classes.DinamicArray;

public class DinamicArray {
    private int[] array = new int[10];
    private int size=0;

    public void add(int value) {
        if (array.length ==size) {
            extend();
        }
        array[size++] = value;

    }

    public int getByIndex(int index) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("OutOfBounderies");
            return -1;
        }
        return array[index];
    }


    private void extend() {
        int[] tmp = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i];
        }
        tmp = array;
    }


    void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }

    }
}
