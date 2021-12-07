package homework.exercises;

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
            System.out.println(array[i]);
        }


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


        // ex. 1

        int x = 4;
        if (x == 3)
            System.out.println("1");
        System.out.println("2");


        //ex.2
        int i = 1, j = 10;
        do {
            if (i > j) {
                break;
            }
            j--;
        } while (++i < 5);
        System.out.println("i = " + i + " и j = " + j);


        //ex. 3
        boolean flag = true;
        int value;
        if (flag) {
            value = flag ? 1 : 2;
        } else {
            value = flag ? 3 : 4;
        }
        System.out.println(value);


        //ex. 4
        for (int i1 = 4; i1 <= 5; i1++) {
            for (int j1 = 0; j1 < 6; j1 = j1 + 2) {
                System.out.println(i1 + ", " + j1);
            }
        }


        //  ex. 5
        boolean isPrime;
        int num = 14;
        if (num < 2){
            isPrime = false;}
        else {
            isPrime = true;
        }
        for (int k = 2; k <= num / k; k++) {
            if ((num % k == 0)) {
                isPrime = false;
                break;

            }
        }

        if (isPrime) System.out.println("Prime");
        else System.out.println("Not Prime");


    }
}













