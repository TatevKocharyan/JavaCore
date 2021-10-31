package homework.classes;

public class PracticeHomeworkTest {
    public static void main(String[] args) {
        PracticeHomework time = new PracticeHomework();

        long min = time.convert(5);
        System.out.println(min);

        int year = time.calcAge(2);
        System.out.println(year);

        int a = time.nextNumber(7);
        System.out.println(a);

        boolean same = time.isSameNum(4, 4);
        System.out.println(same);

        boolean zero = time.lessThanOrEqualToZero(5);
        System.out.println(zero);

        boolean bool = time.reverseBool(true);
        System.out.println(bool);


        int[] array11 = {45, 7, 55, 12, 1, 3, 87, 10};
        int[] array22 = {65, 2, 485, 20};

        a = time.maxLength(array11, array22);
        System.out.println(a);

    }
}


