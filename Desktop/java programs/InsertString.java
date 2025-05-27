import java.util.Scanner;

public class InsertString {
    // Java program to insert a string into another string
// without using any pre-defined method
        // Function to insert string
        public static String insertString(String originalString,String stringToBeInserted,int index)
        {
            // Create a new string
            String newString = "";
            for (int i = 0; i < originalString.length(); i++) {
                // Insert the original string character
                // into the new string
                newString += originalString.charAt(i);
                if (i == index) {
                    // Insert the string to be inserted
                    // into the new string
                    newString += stringToBeInserted;
                }
            }
            // return the modified String
            return newString;
        }
        // Driver code
        public static void main(String[] args)
        {
            // Get the Strings
            Scanner scan = new Scanner(System.in);
            String originalString = scan.nextLine();
            String stringToBeInserted =scan.nextLine();
            int index =scan.nextInt();
            System.out.println("Original String:"+originalString);
            System.out.println("String to be inserted: "+ stringToBeInserted );
            System.out.println("String to be inserted at index:"+index);
            // Insert the String
            System.out.println("Modified String: " + insertString(originalString, stringToBeInserted, index));
        }
    }