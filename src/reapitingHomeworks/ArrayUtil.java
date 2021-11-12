package reapitingHomeworks;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i])
                max = array[i];

        }
        System.out.println(max);


        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }

        }
        System.out.println(min);


        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                System.out.print(array[i] + " ");
        }
        System.out.println();


        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0)
                System.out.print(array[i] + " ");
        }
        System.out.println();



        int countofevens = 0;
        for (int i = 0; i <array.length ; i++) {
            if (array[i]%2==0)
                countofevens++;

        }
        System.out.println(countofevens);


        int countofodd=0;
        for (int i = 0; i <array.length ; i++) {
            if (array[i]%2!=0)
                countofodd++;


        }
        System.out.println(countofodd);



        int sum=0;
        for (int i = 0; i <array.length ; i++) {
            sum=sum+array[i];

        }
        System.out.println(sum);
        double avarage=sum;
        System.out.println(avarage/array.length);











    }
}
