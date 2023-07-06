package org.example.OopsConcepts;

public abstract class Department {
    public abstract int getDepartmentSize();
    public static void main(String[] args) {
        SubDepartment department = new SubDepartment();
        department.departmentSize = 25;
        int size = department.getDepartmentSize();
        System.out.println(size);
    }
}
class SubDepartment extends Department {
    public int departmentSize;
    public int getDepartmentSize() {
        return departmentSize;
    }

}