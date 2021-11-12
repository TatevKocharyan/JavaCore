package homework.classes.student;

public class StudentTest {
    public static void main(String[] args) {
        Student poxos = new Student("Poxos", "Poxosyan",
                16, "Java", "095555555");


        System.out.println(poxos.getName());
        poxos.setName("Poxosik");
        System.out.println(poxos.getName());
    }




}
