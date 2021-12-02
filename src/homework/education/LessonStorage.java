package homework.education;

public class LessonStorage {
    private Lesson[] lessons = new Lesson[10];
    int size = 0;

    public void add(Lesson lesson) {
        if (lessons.length == size) {
            extend();
        }
        lessons[size++] = lesson;
    }

    private void extend() {
        Lesson[] tmp = new Lesson[lessons.length + 10];
        System.arraycopy(lessons, 0, tmp, 0, lessons.length);
        lessons = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(lessons[i] + " ");

        }
    }


    public Lesson deleteLessonByName(String name) {
        for (int i = 0; i < size; i++) {
            if (lessons[i].getName().equals(name)) {
                ArrayUtilForEducation.deleteByIndex(lessons,i,size);
                size--;
               break;
            }

        }return null;

    }
}
