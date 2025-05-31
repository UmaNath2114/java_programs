
    import java.util.Scanner;

    public class MaxOfTwo {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter first number: ");
            int a = scanner.nextInt();
            System.out.print("Enter second number: ");
            int b = scanner.nextInt();
            int max = (a + b + Math.abs(a - b)) / 2;
            int min = (a + b - Math.abs(a - b)) / 2;
            System.out.println("Maximum number is: " + max);
            System.out.println("Minimum number is: " + min);
        }
    }

