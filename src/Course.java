public class Course
{
    private String courseName;
    private int sectionNumber;
    private int numberOfCredits;
    private Course next;

    public Course() {
        courseName = "";
        sectionNumber = 0;
        numberOfCredits = 0;
        next = null;
    }

    public Course(String cn, int sn, int nc, Course n) {
        courseName = cn;
        sectionNumber = sn;
        numberOfCredits = nc;
        next = n;
    }

    public Course(Course c) {
        courseName = c.courseName;
        sectionNumber = c.sectionNumber;
        numberOfCredits = c.numberOfCredits;
        next = null;

    }

    public void setCourseName(String cn) {
        courseName = cn;
    }

    public void setSectionNumber(int sn) {
        sectionNumber = sn;
    }

    public void setNumberOfCredits(int nc) {
        numberOfCredits = nc;
    }

    public void setLink(Course n) {
        next = n;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getSectionNumber() {
        return sectionNumber;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public Course getLink() {
        return next;
    }

    public String toString()
    {
        return "\n   Course Name: " + courseName + "\n   Section Number: " + sectionNumber
                + "\n   Number of Credits: " + numberOfCredits + "\n\n";
    }
}