public class StaticClass {
    public static int sum;
    static {
        sum = 100;
    }
    public static int sum() {
        return sum;
    }
    public static void main(String[] args) {
        StaticClass sta = new StaticClass();
        int sum = sta.sum();
        System.out.println("Sum : "+sum);
    }
}
