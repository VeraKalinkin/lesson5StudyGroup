import java.util.List;

public class StudyGroupView{

    void sendOnConsole(List<StudyGroup> studyGroups){
        for (StudyGroup group : studyGroups){
            System.out.printf("№ %d : ", group.number);
            System.out.println(group.getTeacher());
        for (Student student : group.getStudentsList())
            System.out.println(student);
        }
    }
}
