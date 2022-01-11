package chapter19;

import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> names=new LinkedList<>();
        names.add("Arev");
        names.add("Arpi");
        names.add("Aregak");
        System.out.println(names.get(0));
        names.remove(1);
        System.out.println(names);
        for (int i = 0; i <20 ; i++) {
            names.add("\nHayarpi"+i);

        }
        System.out.println(names);

    }
}
