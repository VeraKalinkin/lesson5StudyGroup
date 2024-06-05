import java.util.List;

public class StudyGroup {
    int number;
    Teacher teacher;
    List<Student> studentsList;

    public StudyGroup(int number, Teacher teacher, List<Student> studentsList) {
        this.number = number;
        this.teacher = teacher;
        this.studentsList = studentsList;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public List<Student> getStudentsList() {
        return studentsList;
    }

    @Override
    public String toString() {
        return "StudyGroup{ " +
                "teacher= " + teacher +
                ", studentsList= " + studentsList +
                '}';
    }
}
