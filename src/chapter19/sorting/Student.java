package chapter19.sorting;

import homework.education.model.Lesson;

public class Student implements Comparable<Student> {
    private String name;
    private String surname;
    private int age;
    private String email;
    private String phone;




    public Student(String name, String surname, int age, String email, String phone) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.email = email;
        this.phone = phone;


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

  //




    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        //    if (age==o.getAge()){
        //        return 0;
        //    }else if(age>o.getAge()){
        //        return 1;
        //    }return -1;

        return  name.compareToIgnoreCase(o.getName());
    }
}





