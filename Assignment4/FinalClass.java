package Assignment4;

public class FinalClass {
    public final int sum = 100;
    final void sum() {
        System.out.println("This is the final method");
    }

    public static void main(String[] main) {
        FinalClass fin = new FinalClass();
        System.out.println("Sum Value: "+fin.sum);
        fin.sum();
    }
}
