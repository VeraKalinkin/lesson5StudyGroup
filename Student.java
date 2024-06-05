public class Student extends User implements Comparable<Student>{
    private int studentId;

    public Student(int studentId, String firstName, String secondName, String name) {
        super(firstName, secondName, name);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId
                + super.toString() +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(studentId, o.getStudentId());
    }
}
