package chapter10;

import homework.education.model.Student;
import homework.education.storage.LessonStorage;

public class NullPointerExeption {
    public static void main(String[] args) {
        LessonStorage lessonStorage = new LessonStorage();

        //Student student = new Student("dfdffd", "dfdffd", 12, "dsfsdf", "fdsfdf", lessonStorage.getByLessonName("sd"));
        Student student = null;
        meth(student);

    }

    //եթե կարելի է ստւգել if-ով,ապա try catch-ի մեջ դնել հարկավոր չէ
    static void meth(Student student) {
        if (student != null)
            System.out.println(student.getAge());

    }


}