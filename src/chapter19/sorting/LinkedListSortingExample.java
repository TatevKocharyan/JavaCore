package chapter19.sorting;

import java.util.*;

public class LinkedListSortingExample {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Student student = new Student("Poxos", "poxosyan", 89, "pxos@gmail.com", "05545774545");
        Student student1 = new Student("Maro", "posyan", 14, "poos@gmail.com", "055454557545");
        Student student2 = new Student("arto", "tonoyan", 49, "pos@gmail.com", "05544554545");
        studentList.add(student);
        studentList.add(student1);
        studentList.add(student2);
        for (Student singlestudent : studentList) {
            System.out.println(singlestudent);

        }
        Collections.sort(studentList,new StudentAgeComporator());

        System.out.println();
        for (Student singlestudent : studentList) {
            System.out.println(singlestudent);

        }

    }
}
