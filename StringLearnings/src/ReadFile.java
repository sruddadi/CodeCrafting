import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Student implements Comparable<Student> {
        private String fName;
        private String lName;
        private double gpa;

        public Student(String firstName, String lastName, double grade) {
            fName = firstName;
            lName = lastName;
            gpa = grade;
        }

        public String getLastName() {
            return lName;
        }

        public String toString() {
            return fName + " " + lName + "--" + gpa ;
        }

        @Override
        public int compareTo(Student next) {
            return this.getLastName().compareTo(next.getLastName());
        }
    }

public class ReadFile {
        public static void main(String[] args) throws FileNotFoundException {
            String csvFile = "data.csv";
            String line;
            List<Student> students = new ArrayList<>();

            Scanner scanner = new Scanner(new FileReader(csvFile));
                while (scanner.hasNextLine()) {
                    line = scanner.nextLine();
                    String[] data = line.split(",");
                    String firstName = data[0];
                    String lastName = data[1];
                    double gpa = Double.parseDouble(data[2]);

                    Student student = new Student(firstName, lastName, gpa);
                    students.add(student);
                }

            Collections.sort(students);

            for (Student student : students) {
                System.out.println(student);
            }
        }
    }


