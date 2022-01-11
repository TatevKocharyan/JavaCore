package chapter19.sorting;

import java.util.*;

public class SetSortingExample {
    public static void main(String[] args) {
        Set<Student> studentSet = new TreeSet<>();
        Student student = new Student("Poxos", "poxosyan", 89, "pxos@gmail.com", "05545774545");
        Student student1 = new Student("Maro", "posyan", 14, "poos@gmail.com", "055454557545");
        Student student2 = new Student("arto", "tonoyan", 49, "pos@gmail.com", "05544554545");
        studentSet.add(student);
        studentSet.add(student1);
        studentSet.add(student2);
        for (Student singlestudent : studentSet) {
            System.out.println(singlestudent);

        }



    }
}
