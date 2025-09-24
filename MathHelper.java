public class MathHelper {
    // TODO: Implement these methods

    // 1. Create a method called 'calculateSum' that takes two integers
    //    and returns their sum
    public static int calculateSum(int i1, int i2) {
        int result = 0;
        result += i1 + i2;
        return result;
    }
    // 2. Create a method called 'findMin' that takes two integers
    //    and returns the smaller one
    public static int findMin(int i1, int i2) {
        int smallerNum = 0;
        if (i1 > i2) {
            smallerNum = i2;
        } else {
            smallerNum = i1;
        }
        return smallerNum;
    }
    // 3. Create a void method called 'printResult' that takes an integer
    //    and prints "The result is: [number]"
    public static void printResult(int i1) {
        System.out.println("The result is: " + i1);
    }
    public static void main(String[] args) {
        // Test your methods here
        int sum = calculateSum(15, 25);
        int min = findMin(10, 20);
        printResult(sum);
        printResult(min);
    }
}