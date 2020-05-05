public class StudentsDemo {

    public static void main(String[] args) {
        Students list = new Students(3);
        Course compsci = new Course("CSC-162", 1, 3, null);
        System.out.println("first course made" + compsci);
        Course history = new Course("HIS-101", 2, 4, null);
        System.out.println("second course made" + history);
        Course compsci2 = new Course("CSC-236", 4, 3, null);
        System.out.println("third course made" + compsci2);

        System.out.println("-------------");

        list.addStudent(1111, compsci);
        System.out.println("first student made");

        list.addStudent(1234, history);
        System.out.println("second student made");

        list.addStudent(2357, compsci2);
        System.out.println("third student made");

        System.out.println("-------------");

        list.addCourse(1111, compsci);
        System.out.println("adding compsci to student 1");

        list.addCourse(1234, history);
        System.out.println("adding history to student 2");

        list.addCourse(2357, compsci2);
        System.out.println("adding compsci2 to student 3");

        System.out.println("-------------");

        System.out.println(list);

    }
}