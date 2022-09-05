import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentAnalyzer  {
    public static void main(String[] args) {

    List<Student> students = new ArrayList<Student>();

    students.add(new Student("Alaba", 90));
    students.add(new Student("Harry", 60));
    students.add(new Student("Zebra", 50));
    students.add(new Student("John", 52));
    students.add(new Student("Dybala", 59));
    students.add(new Student("Alongso", 70));

    Collections.sort(students , (s1, s2) -> s1.getName().compareTo(s2.getName()));
    System.out.println("\nsorted based on names\n");

    for (Student student : students) {
        System.out.println(student);
    }

    System.out.println("\n-------------------------------------------------------------\n");

    Collections.sort(students , (o1, o2) -> o1.getMarks() - o2.getMarks());
    System.out.println("sorted based on Marks\n");

    for (Student student : students) {
        System.out.println(student);
        }
    }
}