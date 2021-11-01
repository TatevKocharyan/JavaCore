package homework.classes;

public class PracticeHomework {

    //Method 1
    long convert(int minutes) {
        return minutes * 60;
    }

    //Method 2
    int calcAge(int years) {
        return years * 365;
    }

    //Method 3
    int nextNumber(int number) {
        if (number > 0) {
            number++;
        }
        return number;
    }

    //Method 4
    boolean isSameNum(int a, int b) {
        boolean num = false;
        if (a == b) {
            num = true;
        }
        return num;
    }

    //Method 5
    boolean lessThanOrEqualToZero(int number) {
        boolean num = false;
        if (number <= 0) {
            num = true;
        }
        return num;
    }


    // Method 6
    boolean reverseBool(boolean value) {
        boolean reverse = true;
        if (value == true) {
            reverse = false;
        }

        return reverse;
    }

    //Method 7
    int maxLength(int[] array1, int[] array2) {
        int max = 0;
        if (array1.length > array2.length) {
            max = array1.length;
        } else if (array2.length > array1.length)
            max = array2.length;
        return max;
    }


}
