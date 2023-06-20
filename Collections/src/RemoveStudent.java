import java.util.ArrayList;
import java.util.List;

class Student {
    private String firstName;
    private String lastName;
    private double gpa;

    public Student(String firstName, String lastName, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return  firstName  + ", " +
                 lastName + " - " +
                 gpa;
    }
}
public class RemoveStudent {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Srikar", "Uddadi", 3.5));
        studentList.add(new Student("Mani", "Kanadan", 4.0));
        studentList.add(new Student("Sai", "Manasa", 3.2));
        studentList.add(new Student("Vaishnav", "Koratpalli", 3.8));

        System.out.println("Before removing students:");
        System.out.println(studentList);

        double averageGpa = studentList.stream()
                .mapToDouble(Student::getGpa)
                .average()
                .orElse(0.0);

        studentList.removeIf(student -> student.getGpa() < averageGpa);

        System.out.println("After removing students:");
        System.out.println(studentList);
    }
}
