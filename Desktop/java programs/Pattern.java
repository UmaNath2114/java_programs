import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the no of rows: ");
        int n = scan.nextInt();
        String a = "";
        int alpha = 65;
        while(alpha<65+n)
        {
            a=a+(char) alpha;
            System.out.println(a);
            alpha++;
        }
    }
}