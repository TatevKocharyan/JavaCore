package homework.arrayutil;

public class ArrayUtil {
    public static void main(String[] args) {

        int[] array = {1, 54, 47, 321, 654, 784, 12, 4, 8, 11};
        // Task 1Տպեք մասիվի բոլոր էլեմենտները,
        System.out.print("All numbers are ");
        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");
        }
        System.out.println();


        //Task 2Տպեք մասիվի ամենամեծ թիվը,
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        System.out.println("The maximum number is " + max);


        //Task 3Տպեք մասիվի ամենափոքրը թիվը,
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        System.out.println("The minimum number is " + min);


        //Task 4Տպեք մասիվի բոլոր զույգ էլեմենտները,
        System.out.print("The evens are ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                System.out.print(array[i] + " ");

        }
        System.out.println();
        //Task 5 Տպեք մասիվի բոլոր կենտ  էլեմենտները։
        System.out.print("The odds are ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0)
                System.out.print(array[i] + " ");

        }
        System.out.println();

        //Task 6 Տպեք զույգերի քանակը։
        int countOfEven = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                countOfEven++;
            }
        }
        System.out.println("The quantity of evens is " + countOfEven);


        //Task 7 Տպեք կենտերի քանակը
        int countOfodds = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0)
                countOfodds++;

        }
        System.out.println("The quantity of odds is " + countOfodds);
        ////Task 8 Տպեք մասիվի էլեմենտների գումարը։
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > sum)
                sum = sum + array[i];
        }
        System.out.println("The sum of numbers is " + sum);

        //Task 9 Տպեք մասիվի բոլոր թվերի միջին թվաբանականը
        int sum1 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > sum1) {
                sum1 = sum1 + array[i];
            }
        }
        System.out.print("The average of numbers is " + sum1 / array.length);


    }
}
