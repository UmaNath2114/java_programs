import java.util.Scanner;

    public class Pattern1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of rows: ");
            int n = scanner.nextInt();
            for (int i = n; i >=1 ; i--) {
                for (int j = 0; j < i; j++) {
                    System.out.print(9 + " ");
                }
                System.out.println();
            }
        }
    }

