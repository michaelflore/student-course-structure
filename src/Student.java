public class Student {
    private int id;
    private Course first;
    private Course next;

    //Without an argument, first = null
    public Student() {
        id = 0;
        first = null;
    }

    //With an argument, first is linked to c
    public Student(int i, Course c) {
        id = i;
        first = new Course();
        first.setLink(c);

        //System.out.println(first + " = " + c);
    }

    public Student(Student s) {
        id = s.id;
        first = s.first;
    }

    public void setID(int i) {
        id = i;
    }

    public void setCourses(Course c) {
        first.setLink(c);
    }

    public int getID() {
        return id;
    }

    public Course getCourses() {
        return first;
    }

    public void addCourse(Course c) {
        System.out.println(c.toString());

        Course temp = first;
        while(temp.getLink() != null) {
            temp = temp.getLink();
        }
        temp.setLink(c);

        if(first == null) {
            System.out.println("if of add course");
            first = new Course();
            first.setLink(c);
        }
        else if(first.getLink() == null) {
            System.out.println("else if of add course");
            first.setLink(c);
        }
    }

    public boolean dropCourse(Course c) {
        if(first == null) {
            return false;
        }
        if(first.getCourseName().equals(c.getCourseName())) {
            first = first.getLink();
            return true;
        }

        Course temp = first;
        while(temp.getLink() != null) {
            temp = temp.getLink();
            if(temp.getCourseName().equals(c.getCourseName())) {
                temp.setLink(temp.getLink().getLink());
                return true;
            }
        }
        return false;
    }

    public String toString() {

        Course temp = first;
        StringBuilder sb = new StringBuilder();

        while(temp.getLink() != null) {
            temp = temp.getLink();
            System.out.println(temp);
            sb.append(temp.toString());
        }

        return "\nStudent ID #: " + this.getID() + "\nCourses: \n" + sb.toString();
    }
}

