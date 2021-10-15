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

        }System.out.println("Մասիվի ամենամեծ թիվը `"+max);

        //Task 3Տպեք մասիվի ամենափոքրը թիվը,
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];}
        System.out.println("Մասիվի ամենափոքրը թիվը` " +min);

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
            if (array[i] % 2 == 1)
                System.out.print(array[i] + " ");

        }

        //Task 6 Տպեք զույգերի քանակը։




        //Task 7 Տպեք կենտերի քանակը


        //Task 8 Տպեք մասիվի բոլոր թվերի միջին թվաբանականը
        System.out.println();
        double result = array[0] + array[1] + array[2] + array[3] + array[4] + array[5] + array[6] + array[7] + array[8] + array[9];
        System.out.println("Մասիվի թվերի միջին թվաբանականն է " + result / array.length);
        //Տպեք մասիվի էլեմենտների գումարը։







    }
}













