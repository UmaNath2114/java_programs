import java.util.Scanner;

public class PatternABCD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in );
        System.out.println("enter the no of rows:");
                int n=sc.nextInt();
                System.out.println("enter the no of columns ");
                int n1=sc.nextInt();
                int alpha=65;
                String a=" ";
                 if(n==n1){
                    for(int i=1;i<=n;i++){
                        for(int j=1; j<=n1;j++) {
                            System.out.println((char) alpha);
                            a = a + alpha;
                        }
                        alpha++;
                        System.out.println();
                    }
                    }
                }
   }
