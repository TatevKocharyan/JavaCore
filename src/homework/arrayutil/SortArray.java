package homework.arrayutil;

public class SortArray {
    public static void main(String[] args) {
        int[] array = {2, 5, 4, 8, 3, 1, 55, 49, 98, 67};
        int tmp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j] > array[j - 1]) {
                    tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                }
            }

        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
        int[] array1 = {5, 4, 6, 88, 7, 5, 1, 2, 2,};

        for (int i =0; i < array1.length-1; i++) {
            for (int j =i+1; j < array1.length; j++) {
                if (array1[i] == array1[j]) {
                    System.out.println(array1[i] + "-ը կրկնվում է");
                    break;
                }
            }
        }


    }
}
