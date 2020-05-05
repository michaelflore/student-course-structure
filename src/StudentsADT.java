public interface StudentsADT{
    void setMaxNumberOfStudents(int max);
    void addStudent(int id, Course c);
    void addCourse(int id, Course c);
    void dropCourse(int id, Course c);
}