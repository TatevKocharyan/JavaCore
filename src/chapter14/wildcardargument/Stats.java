package chapter14.wildcardargument;

public class Stats<T extends Number> {

    T[] nums;

    public Stats(T[] o) {
        nums = o;
    }

    double average() {
        double sum = 0.0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i].doubleValue();
        }
        return sum / nums.length;


    }


    boolean sameAvg(Stats<?> ob) {
        if (average() == ob.average()) {
            return true;
        } else return false;
    }


}
