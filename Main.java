import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher(1, "Rtf", "Dsw", "Grc");
        Student student1 = new Student(1, "Urd", "Szn", "Wqs");
        Student student2 = new Student(2, "Bfc", "Dsx", "Jgn");

        StudentGroup studentGroup = new StudentGroup(new ArrayList<>());
        studentGroup.addStudent(student1);
        studentGroup.addStudent(student2);


        StudyGroupController controller = new StudyGroupController();
        controller.create(teacher, studentGroup.getStudentList());
        controller.create(teacher, studentGroup.getStudentList());
        controller.create(teacher, studentGroup.getStudentList());
        controller.printGroup();

        }
}