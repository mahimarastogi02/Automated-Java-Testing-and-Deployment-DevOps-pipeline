public class SwapNumbers {
    public static void main(String[] args) {
        int num1 = 5, num2 = 10, temp;

        System.out.println("Before swapping:");
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);

        // Swap the values of num1 and num2
        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("\nAfter swapping:");
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
    }
}