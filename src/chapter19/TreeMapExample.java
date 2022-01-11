package chapter19;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<String,Integer> map =new TreeMap<>() ;
        map.put("poxos@gmail.com",12);
        map.put("petros@gmail.com",45);
        map.put("petrosik@gmail.com",44);
        map.put("apetrosik@gmail.com",444);

        for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
            System.out.println(stringIntegerEntry.getValue());// տպում է այբբենական կարգով և թվի աճման կարգով

        }
    }
}
