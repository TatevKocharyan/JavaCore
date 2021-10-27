package homework.classes;

public class ArrayUtile {

    void AllElements(int[] array, int n) {
        System.out.print("1 Մասիվի բոլոր էլեմենտներն են`");
        for (int i = 0; i < n; i++) {
            System.out.print((array[i]) + " ");
        }
        System.out.println();

    }

    void max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];

        }
        System.out.println("2 Մասիվի ամենամեծ թիվը `" + max);
    }


    void min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        System.out.println("3 Մասիվի ամենափոքրը թիվը` " + min);
    }

    //4
    void even(int[] array) {
        System.out.print("4 Մասիվի զույգ էլեմենտներն են`");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                System.out.print(array[i] + " ");
        }
        System.out.println();
    }


    //Task 5
    void odds(int[] array) {
        System.out.print("5 Մասիվի կենտ էլեմենտներն են`");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0)
                System.out.print(array[i] + " ");

        }
        System.out.println();
    }

    //6
    void setCountofEvens(int[] array) {
        int countofEvens = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                countofEvens++;
            }
        }
        System.out.println("6 Մասիվի զույգ էլեմենտների քանակն է`" + countofEvens);
    }

    //7
    void  setCountOfodds (int []array){
    int countOfodds = 0;
        for (int i = 0; i < array.length; i++) {
        if (array[i] % 2 != 0) {
            countOfodds++;
        }
    }
        System.out.println("7 Մասիվի կենտ էլեմենտների քանակն է " + countOfodds);}


    //8
    void setSum(int []array){
    int sum = 0;
        for (int i = 0; i < array.length; i++) {
        if (array[i] > sum) ;
        sum += array[i];
    }
        System.out.println("8 Մասիվի էլեմենտների գումարն է " + sum);}



    //9
    void setSum1(int []array){
    int sum1 = 0;
        for (int i = 0; i < array.length; i++) {
        if (array[i] > sum1) ;
        {
            sum1 += array[i];
        }
    }
    double average = sum1;

        System.out.println("9 Մասիվի թվերի միջին թվաբանականն է " + average / array.length);}


































}
