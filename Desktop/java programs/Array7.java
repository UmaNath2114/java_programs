 import java.util.Scanner;

 public class Array7 {
    public static void main(String[] args) {
        int[][] numbers = new int[2][5];
        Scanner scanner = new Scanner(System.in);
        // Take input from user
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 5; col++) {
                numbers[row][col] = scanner.nextInt();
            }
        }
        // Print the array
        System.out.println("\nNumbers in 2D array:");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 5; col++) {
                System.out.print(numbers[row][col] + "\t");
            }
            System.out.println();
        }
        scanner.close();
    }
}

