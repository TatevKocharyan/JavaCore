package homework.classes.PracticeHomework;

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
        return number + 1;
    }

    //Method 4
    boolean isSameNum(int a, int b) {
        return a == b;
    }

    //Method 5
    boolean lessThanOrEqualToZero(int number) {
        return number <= 0;
    }


    // Method 6
    boolean reverseBool(boolean value) {
        return !value;
    }

    //Method 7
    int maxLength(int[] array1, int[] array2) {
        return array1.length > array2.length ?
                array1.length : array2.length;
    }


}
