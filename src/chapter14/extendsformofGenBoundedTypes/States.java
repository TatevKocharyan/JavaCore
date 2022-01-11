package chapter14.extendsformofGenBoundedTypes;

public class States<T extends Number> {
    T[] nums;

    States(T[] o) {
        nums = o;
    }

    double average() {
        double sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i].doubleValue();


        }
        return sum / nums.length;

    }


}
