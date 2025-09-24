public class Calculator {
    // TODO: Create multiple versions of a 'multiply' method that can handle:
    public static int multiply(int i1, int i2) {
        return i1 * i2;
    }
    public static int multiply(int i1, int i2, int i3) {
        return i1 * i2 * i3;
    }
    public static double multiply(double i1, double i2) {
        return i1 * i2;
    }
    public static String multiply(int i1, String i2) {
        return i2.repeat(i1);
    }
    public static void main(String[] args) {
        // Test all your overloaded methods
        System.out.println("Two ints: " + multiply(5, 3));
        System.out.println("Three ints: " + multiply(5, 3, 2));
        System.out.println("Two doubles: " + multiply(5.5, 3.2));
        System.out.println("Int and string: " + multiply(3, "Hi!"));
    }
}