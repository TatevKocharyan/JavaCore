package homework.educationwithcollectins.education.model;

import java.io.Serializable;

public class Student implements Serializable,Comparable {
    private String name;
    private String surname;
    private int age;
    private String email;
    private String phone;
    private Lesson lesson;



    public Student(String name, String surname, int age, String email, String phone, Lesson lesson) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.email = email;
        this.phone = phone;
        this.lesson= lesson;

    }

    public Student(){}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", \nlesson='" + lesson + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}





