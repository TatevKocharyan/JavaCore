package homework.education;

import homework.education.enums.UserType;
import homework.education.model.Lesson;
import homework.education.model.Student;
import homework.education.model.User;
import homework.education.storage.LessonStorage;
import homework.education.storage.StudentStorage;
import homework.education.storage.UserStorage;

import java.util.Locale;
import java.util.Scanner;

public class StudentTest implements Commands {
    private static Scanner scanner = new Scanner(System.in);
    private static StudentStorage studentStorage = new StudentStorage();
    private static LessonStorage lessonStorage = new LessonStorage();
    private static UserStorage userStorage = new UserStorage();

    public static void main(String[] args) {
        lessonStorage.add(new Lesson("arm", "2 hours", "A.Sahakyan", 50));
        lessonStorage.add(new Lesson("rus", "2 hours", "A.Sahakyan", 50));
        lessonStorage.add(new Lesson("eng", "2 hours", "A.Sahakyan", 50));
        studentStorage.add(new Student("poxos", "poxosyan", 19, "mail", "055555555", lessonStorage.getByLessonName("eng")));
        userStorage.add(new User("Poxos", "Poxosyan", "poxos@gmail.com", "poxos555", UserType.ADMIN));
        //userStorage.add(new User("Poxos", "Poxosyan", "poxos@gmail.com", "poxos555", UserType.USER));

        boolean isRun = true;
        while (isRun) {
            Commands.printLoginRegisterCommandsForUser();
            String commandforUser = scanner.nextLine();
            switch (commandforUser) {
                case LOGIN:
                    requireEmailandPassword();
                    break;
                case REGISTER:
                    requireUserDatas();
                    break;
                case LOGOUT:
                    isRun = false;
                    break;
                default:
                    System.out.println("Invalid command!! ");
                    break;
            }


        }


    }


    private static void userLogin() {
        boolean isRun2 = true;
        while (isRun2) {
            String command = scanner.nextLine();
            switch (command) {
                case LOGOUT:
                    isRun2 = false;
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
                default:
                    System.out.println("Invalid command!! ");
                    break;
            }

        }

    }


    private static void adminLogin() {
        boolean isRun1 = true;
        while (isRun1) {
            Commands.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case LOGOUT:
                    isRun1 = false;
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
                case DELETE_STUDENT_BY_EMAIL:
                    deleteStudentByEmail();
                    break;
                default:
                    System.out.println("Invalid command!! ");
                    break;
            }

        }
    }


    private static void requireUserDatas() {


        System.out.println("Please input Users name");
        String name = scanner.nextLine();
        System.out.println("Please input Users surname");
        String surname = scanner.nextLine();
        System.out.println("Please input Users email");
        String email = scanner.nextLine();
        System.out.println("Please input Users password");
        String password = scanner.nextLine();
        System.out.println("Please input Users type");
        String type = scanner.nextLine();
        try {
            if (UserType.valueOf(type.toUpperCase()).equals(UserType.ADMIN)) {
                System.out.println("you cannot register as an admin");
            } else {
                User user = new User(name, surname, email, password, UserType.valueOf(type.toUpperCase()));
                userStorage.checkUser(email, password);
                userStorage.add(user);
                Commands.printCommandsForuser();
                userLogin();
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }


    private static void requireEmailandPassword() {

        System.out.println("Please input your email");
        String email = scanner.nextLine();
        System.out.println("Please input your password");
        String password = scanner.nextLine();
        User userinfo = null;
        userinfo = userStorage.checkUser(email, password);
        if (userinfo != null) {
            System.out.println("please input user or admin ");
            UserType.valueOf(scanner.nextLine());

            if (UserType.ADMIN.equals(userinfo.getType())) {
                adminLogin();
            }
            if (UserType.USER.equals(userinfo.getType())) {
                Commands.printCommandsForuser();
            }
        } else {
            System.out.println("Your password and login is incorrect");
        }


    }


    private static void deleteStudentByEmail() {
        System.out.println("Please input student's email for deleting");
        String email = scanner.nextLine();
        Student student = studentStorage.deleteByEmail(email);

    }

    private static void deleteLessonByName() {
        System.out.println("Please input name of the lesson for deleting ");
        String name = scanner.nextLine();
        Lesson lesson = lessonStorage.deleteLessonByName(name);

    }

    private static void printStudentsByLessons() {
        System.out.println("please input lesson name for printing Student");
        String lessonname = scanner.nextLine();
        studentStorage.printBylessonName(lessonname);

    }

    private static void addStudent() {
        System.out.println("Please input lesson");
        System.out.println("_______");
        lessonStorage.print();
        System.out.println("_______");
        String lessonname = scanner.nextLine();
        Lesson lesson = lessonStorage.getByLessonName(lessonname);
        if (lesson != null)
            lesson.setName(lessonname);
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
        Student studentInformation = new Student(name, surname, age, email, phone, lesson);
        studentStorage.add(studentInformation);
        System.out.println("Thank you student was added");
    }

    private static void addLesson() {
        System.out.println("Please input the lesson");
        String name = scanner.nextLine();
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
