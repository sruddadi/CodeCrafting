package org.example.CollectionAdvanced;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class KeyValueDemo {
    public static void main(String[] args) {

        Student student1 = new Student(1,"Srikar", "Uddadi", 3.8);
        Student student2 = new Student(2,"Sai", "Manasa", 3.9);
        Student student3 = new Student(3,"Mani", "Kandan", 3.5);
        Student student4 = new Student(4,"Sritej", "Marni", 3.2);
        Student student5 = new Student(5,"Vaishnav", "Koratpalli", 3.7);
        Student student6 = new Student(6,"Sai", "Prateek", 3.6);
        Student student7 = new Student(7,"Tom", "Cruise", 3.9);
        Student student8 = new Student(8,"Robert", "Downey", 3.4);

        HashMap<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(student1.getId(), student1);
        studentMap.put(student2.getId(), student2);
        studentMap.put(student3.getId(), student3);
        studentMap.put(student4.getId(), student4);
        studentMap.put(student5.getId(), student5);
        studentMap.put(student6.getId(), student6);
        studentMap.put(student7.getId(), student7);
        studentMap.put(student8.getId(), student8);

        System.out.println("Print using Entry set:");
        for (Entry<Integer, Student> entry : studentMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        System.out.println("\nPrint using map's forEach method:");
        studentMap.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));

        System.out.println("\nPrint using keySet and Iterator:");
        Iterator<Integer> kIterator = studentMap.keySet().iterator();
        while (kIterator.hasNext()) {
            int key = kIterator.next();
            System.out.println("Key: " + key + ", Value: " + studentMap.get(key));
        }
    }
}

class Student {
    private int id;
    private String firstName;
    private String lastName;
    private double gpa;

    public Student(int id, String firstName, String lastName, double gpa) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getGPA() {
        return gpa;
    }

    @Override
    public String toString() {
        return  firstName  + ", " +
                lastName + " - " +
                gpa;
    }
}
