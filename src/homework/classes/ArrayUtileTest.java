package homework.classes;

public class ArrayUtileTest {
    public static void main(String[] args) {
        ArrayUtile Object = new ArrayUtile();
        int[] numbers = {12, 45, 7, 8, 3, 5, 1, 2, 4, 465};

        Object.AllElements(numbers, 10);

        Object.max(numbers);

        Object.min(numbers);
        Object.odds(numbers);
        Object.even(numbers);
        Object.setCountofEvens(numbers);
        Object.setCountOfodds(numbers);
        Object.setSum(numbers);
        Object.setSum1(numbers);


    }
}
