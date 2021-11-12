package reapitingHomeworks;

public class DynamicArray {
    private int[] array = new int[10];
    //սա մեր մասիվի ավելացված էլեմենտների քանակն է
    private int size = 0;

    //M.1
    public void add(int value) {
        if (array.length == size) {
            extend();
        }
        array[size++] = value;
    }

    //M.2
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");

        }
    }

//M.3
    private void extend() {
        int[] array1 = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            array1[i] = array[i];
        }
        array = array1;

    }

    //M.4
    public int GetByIndex(int index){
        if (index<=0 || index>array.length-1){
            System.err.println("Invalid index");
            return -1;

        }return array[index];




    }




}



