package homework.education;

public class StudentStorage {
    private Student[] students = new Student[10];
    int size = 0;

    //M
    public void add(Student student) {
        if (students.length == size) {
            extend();
        }
        students[size++] = student;
    }

    // M
    private void extend() {

        Student[] tmp = new Student[students.length + 10];
        System.arraycopy(students, 0, tmp, 0, students.length);

        students = tmp;

    }

    //M
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(students[i] + " ");

        }
    }

    public Student printBylessonName(String lessonname) {
        for (int i = 0; i <size ; i++) {
            if(students[i].getLesson().equals(lessonname)){
                System.out.println(students[i]);
            }


        }return null;
    }
}
