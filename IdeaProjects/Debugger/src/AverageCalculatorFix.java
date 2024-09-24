/*
David Cortinez
09/23/2024
Purpose: Learn to use the debugging features in IntelliJ IDEA to identify and fix bugs in a Java program.
 */

/*
--- Reflection --------------------------------------------------------------------------------------------------------
The array starts at index 0 while the string length starts from 1 and NOT 0.  I subtracted one from the length to
 to have it match the array count.
 While debugging I was able to follow along and see how each "numbers" it pulled was being calculated and noticed that it
 never did stop at i=4 in the for loop and tried pulling a nonexistent number from the array at i=5
 ----------------------------------------------------------------------------------------------------------------------
 */

public class AverageCalculatorFix {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        double average = calculateAverage(numbers);
        System.out.println("The average is: " + average);
    }

    private static double calculateAverage(int[] nums) {
        double sum = 0;
        for (int i = 0; i <= nums.length - 1; i++) {
            sum += nums[i];
        }
        return sum / nums.length;
    }
}
