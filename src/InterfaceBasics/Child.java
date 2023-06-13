package InterfaceBasics;

public class Child extends Parent{
    int childVariable;
    public Child() {
        this.parentVariable = 10;
        this.childVariable = 20;
        System.out.println("Parent Variable : "+this.parentVariable);
        System.out.println("Child Variable : "+this.childVariable);
    }
    public Child(int childVariable) {
        this.childVariable = childVariable;
        System.out.println("Child Variable : "+this.childVariable);
    }
    public static void main(String[] args) {
        Child child = new Child();
        Child child2 = new Child(25);
    }
}
