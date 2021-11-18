package homework.classes.DinamicArray;

public class DinamicArray {
    private int[] array = new int[10];
    private int size = 0;

    //M
    public void add(int value) {
        if (array.length == size) {
            extend();
        }
        array[size++] = value;

    }

    //M
    public void add(int value, int index) {
        if (index < 0 || index > size) {
            System.err.println("OutOfBounderies");
        } else {
            if (size == array.length) {
                extend();
            }
            for (int i = size-1; i >=index; i--) {
                array[i+1] = array[i];

            }
        }
        array[index] = value;
        size++;
    }

    //M
    public void set(int value, int index) {
        if (index < 0 || index > size) {
            System.err.println("OutOfBounderies");
        } else {
            array[index] = value;
        }

    }


    //M
    public int getByIndex(int index) {
        if (index < 0 || index > size) {
            System.err.println("OutOfBounderies");
            return -1;
        }
        return array[index];
    }


    //M
    public void delete(int index) {
        if (index < 0 || index > size) {
            System.err.println("OutOfBounderies");
        }

        for (int i = index + 1; i < size; i++) {
            array[i - 1] = array[i];
        }
        size--;


    }


    //M
    private void extend() {
        int[] tmp = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i];
        }
        array = tmp;
    }

    //M
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]+" ");
        }
    }

}

