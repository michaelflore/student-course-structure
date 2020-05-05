import java.util.ArrayList;

public class Students implements StudentsADT {

    private int maxNumberOfStudents;
    ArrayList<Student> studentList;

    public Students() {
        maxNumberOfStudents = 0;
        studentList = new ArrayList<>();
    }

    public Students(int mnos) {
        maxNumberOfStudents = mnos;
        studentList = new ArrayList<>();
    }

    public Students(Students s) {
        maxNumberOfStudents = s.maxNumberOfStudents;
        studentList = s.studentList;
    }

    public void setMaxNumberOfStudents(int max) {
        maxNumberOfStudents = max;
    }

    public void addStudent(int id, Course c) {
        if(studentList.size() == maxNumberOfStudents) {
            System.out.println("Student list full.");
        }
        else {
            studentList.add(new Student(id, c));
        }
    }

    public void addCourse(int id, Course c) {
        int student = locateByID(id);
        if(student == -1) {
            System.out.println("Student not found.");
        }
        else {
            (studentList.get(student)).addCourse(c);
        }
    }

    public void dropCourse(int id, Course c) {
        int student = locateByID(id);
        if(student == -1) {
            System.out.println("Student not found.");
        }
        else {
            studentList.get(student).dropCourse(c);
        }
    }

    private int locateByID(int id) {
        for(int i = 0; i < studentList.size(); i++) {
            if(studentList.get(i).getID() == id) {
                return i;
            }
        }
        return -1;
    }

    public String toString() {
        return "Printing List";
    }
}