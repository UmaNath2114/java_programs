import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, sum = 0, value;
        double avg;

        System.out.print("Enter the value of N: ");
        n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter the value " + i + ": ");
            value = scan.nextInt();
            sum += value;
            System.out.println("The sum value: "+sum);
        }

        avg = (double) sum / n;
        System.out.println("The average value: " + avg);
    }
}
