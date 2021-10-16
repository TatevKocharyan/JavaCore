package homework.arrayutil;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30};

        // Task 1Տպեք մասիվի բոլոր էլեմենտները,
        System.out.print("Մասիվի բոլոր էլեմենտներն են`");
        for (int i = 0; i < 10; i++) {
            System.out.print((array[i]) + " ");
        }
        System.out.println();




        //Task 2Տպեք մասիվի ամենամեծ թիվը,
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];

        }
        System.out.println("Մասիվի ամենամեծ թիվը `" + max);



        //Task 3Տպեք մասիվի ամենափոքրը թիվը,
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        System.out.println("Մասիվի ամենափոքրը թիվը` " + min);




        //Task 4Տպեք մասիվի բոլոր զույգ էլեմենտները,
        System.out.print("Մասիվի զույգ էլեմենտներն են`");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                System.out.print(array[i] + " ");
        }
        System.out.println();
        //Task 5 Տպեք մասիվի բոլոր կենտ  էլեմենտները։
        System.out.print("Մասիվի կենտ էլեմենտներն են`");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 1)
                System.out.print(array[i] + " ");

        }
        System.out.println();



        //Task 5 Տպեք զույգերի քանակը։
        int countofEvens = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                countofEvens++;
            }
        }
        System.out.print("Մասիվի զույգ էլեմենտների քանակն է`" + countofEvens);


        //Task 6 Տպեք կենտերի քանակը։
        int countOfodds = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 1) {
                countOfodds++;
            }
        }
        System.out.println(" Մասիվի կենտ էլեմենտների քանակն է " + countOfodds);



        //Task 7 Տպեք մասիվի էլեմենտների գումարը։
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > sum) ;
            sum += array[i];
        }
        System.out.println("Մասիվի էլեմենտների գումարն է " + sum);



        //Task 8 Տպեք մասիվի բոլոր թվերի միջին թվաբանականը
        int sum1 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > sum1) ;
            {
                sum1 += array[i];
            }
        }
        double average = sum1;

        System.out.println("Մասիվի թվերի միջին թվաբանականն է " + average / array.length);


    }
}













