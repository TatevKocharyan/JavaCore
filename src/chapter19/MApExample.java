package chapter19;

import homework.classes.student.Student;
import jdk.nashorn.internal.ir.annotations.Immutable;

import java.util.HashMap;
import java.util.Map;

public class MApExample {
    public static void main(String[] args) {
        Map<String, Student> studentMap = new HashMap<>();
        Student student = new Student("Poxos", "Poxosyan", 21, "english", "055656565");
        studentMap.put("poxos@mail.com", student);
        System.out.println(studentMap);
        System.out.println(studentMap.values());
        System.out.println(studentMap.containsKey("poxos@mail.com"));
        System.out.println(studentMap.isEmpty());
        System.out.println(studentMap.containsValue(student));
        System.out.println(studentMap.entrySet());
        for (String s : studentMap.keySet()) {
            System.out.println("s = " + s);

        }
        for (Map.Entry<String, Student> stringStudentEntry : studentMap.entrySet()) {
            System.out.println(stringStudentEntry);
        }


    }
}
