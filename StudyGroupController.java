import java.util.ArrayList;
import java.util.List;

public class StudyGroupController {
    StudyGroupService groupService = new StudyGroupService();
    StudyGroupView groupView = new StudyGroupView();

    List<StudyGroup> studyGroups = new ArrayList<>();

    public void create(Teacher teacher, List<Student> students){
        int number = 1;
        if (!studyGroups.isEmpty())
            number = studyGroups.size() + 1;
        StudyGroup group = new StudyGroup(number,teacher, students);
        studyGroups.add(group);
    }

    public  void printGroup(){
        groupView.sendOnConsole(studyGroups);
    }
}
