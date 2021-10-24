package homework;

public class Exercises {
    public static void main(String[] args) {
        System.out.println("\'");
        System.out.println("\"");
        System.out.println("\\\\");
        System.out.println("\\");
        System.out.println("\r");
        System.out.println("\n");
        System.out.println("\f");
        System.out.println("\t");
        System.out.println("\b");
        System.out.println("hello\nworld");
        System.out.println("hello\tworld");
        System.out.println("hello\bworld");
        System.out.println("hello\rworld");

        System.out.println();
        int[] array = new int[]{1, 2, 3, 4, 5};
        for (int i = 0; i < array.length; i++) {
        array[i] = array[i] * 2;
        System.out.println(array[i]);}


// The below line is equal to line1 + line2
        int[] intArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

// Accessing the elements of the specified array
        for (int i = 0; i < intArray.length; i++)
        System.out.println("Element at index " + i + ": " + intArray[i]);

        char symbol = 'a';
        String[][] intarray = new String[3][6];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                intarray[i][j] = symbol + "" + (j + 1);

                System.out.print(intarray[i][j] + " ");
            }
            symbol++;
            System.out.println();
        }


        
    }
}