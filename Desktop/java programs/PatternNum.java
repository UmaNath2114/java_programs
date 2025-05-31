 import java.util.Scanner;
public class PatternNum {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of rows: ");
            int n = scanner.nextInt();
            for (int i = 0; i <= n; i++) {
                for (int j = 9; j >= i; j--) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
}