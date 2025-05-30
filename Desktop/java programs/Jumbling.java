import java.util.Scanner;

public class Jumbling {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first 5-Letter word: ");
        String str1 = scan.nextLine();
        System.out.print("Enter second 5- letter word: ");
        String str2 = scan.nextLine();
        if (str1.length()!=5 || str2.length() !=5 ){
            System.out.println("Both strings must be exactly 5 characters long");
        } else {
            String jumbled = "";
            for(int i =0;i<5;i++){
                jumbled = jumbled + str1.charAt(i) + str2.charAt(i)     ;
            }
            System.out.println("Jumbled word: " + jumbled);
        }

    }
}
