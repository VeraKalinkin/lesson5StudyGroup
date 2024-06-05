import java.util.List;

public class StudyGroupService {

    public StudyGroup createStudyGroup(int number, Teacher teacher, List<Student> students){
        return new StudyGroup(number, teacher, students);
    }
}
