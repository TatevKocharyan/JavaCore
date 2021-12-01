package homework.education;

import java.util.Scanner;

public class StudentTest {
    private static Scanner scanner = new Scanner(System.in);
    private static StudentStorage studentStorage = new StudentStorage();
    private static LessonStorage lessonStorage = new LessonStorage();


    private static final String EXIT = "0";
    private static final String ADD_LESSON = "1";
    private static final String ADD_STUDENT = "2";
    private static final String PRINT_STUDENTS = "3";
    private static final String PRINT_STUDENTS_BY_LESSON = "4";
    private static final String PRINT_LESSONS = "5";
    private static final String DELETE_LESSON_BY_NAME = "6";
    private static final String DELETE_STUDENT_BY_EMAIL = "7";

    private static void printCommands() {
        System.out.println("Please input " + EXIT + " for EXIT");
        System.out.println("Please input " + ADD_LESSON + " for ADD_LESSON");
        System.out.println("Please input " + ADD_STUDENT + " for ADD_STUDENT");
        System.out.println("Please input " + PRINT_STUDENTS + " for PRINT_STUDENTS");
        System.out.println("Please input " + PRINT_STUDENTS_BY_LESSON + " for PRINT_STUDENTS_BY_LESSON");
        System.out.println("Please input " + PRINT_LESSONS + " for PRINT_LESSONS");
        System.out.println("Please input " + DELETE_LESSON_BY_NAME + " for DELETE_LESSON_BY_NAME");
        System.out.println("Please input " + DELETE_STUDENT_BY_EMAIL + " for  DELETE_STUDENT_BY_EMAIL");


    }


    public static void main(String[] args) {

        boolean isRun = true;
        while (isRun) {
            printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_LESSON:
                    addLesson();
                    break;
                case ADD_STUDENT:
                    addStudent();
                    break;
                case PRINT_STUDENTS:
                    studentStorage.print();
                    break;
                case PRINT_STUDENTS_BY_LESSON:
                    printStudentsByLessons();
                    break;
                case PRINT_LESSONS:
                    lessonStorage.print();
                    break;
                case DELETE_LESSON_BY_NAME:
                    deleteLessonByName();
                    break;
            }

        }


    }

    private static void deleteLessonByName() {
        System.out.println("Please input name of the lesson for deleting ");
        String name=scanner.nextLine();
        Lesson lesson=lessonStorage.deleteLessonByName(name);
    }

    private static void printStudentsByLessons() {
        System.out.println("please input lesson name for printing Student");
        String lessonname=scanner.nextLine();
        studentStorage.printBylessonName(lessonname);

    }

    private static void addStudent() {
        System.out.println("Please input Student's name");
        String name = scanner.nextLine();
        System.out.println("Please input Student's surname");
        String surname = scanner.nextLine();
        System.out.println("Please input Student's age");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Please input Student's email");
        String email = scanner.nextLine();
        System.out.println("Please input Student's phone");
        String phone = scanner.nextLine();
        System.out.println("Please input Student's lesson");
        String lesson = scanner.nextLine();
        Student studentInformation = new Student(name, surname, age, email, phone, lesson);
        studentStorage.add(studentInformation);
        System.out.println("Thank you student was added");
    }

    private static void addLesson() {
        System.out.println("Please input the lesson");
        String name = scanner.next();
        System.out.println("Please input  duration of the lesson");
        String duration = scanner.nextLine();
        System.out.println("Please input lecturar's name");
        String lecturarName = scanner.nextLine();
        System.out.println("Please input price of the lesson");
        int price = Integer.parseInt(scanner.nextLine());
        Lesson lessoninformation = new Lesson(name, duration, lecturarName, price);
        lessonStorage.add(lessoninformation);
        System.out.println("Thank you lesson was added");
    }
}
