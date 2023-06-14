public class JavaObject {
    public static class Student {
        String Name;
        public String getStudent() {
            return Name;
        }
        public void setStudent(String name) {
            Name = name;
        }
    }
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setStudent("Srikar");
        System.out.println(stu.getStudent());
    }
}