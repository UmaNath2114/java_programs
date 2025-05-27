public class StringCompare{
        public static void main(String[] args) {
            String str1 = "Krishna";
            String str2 = "KRISHNA";
            if (str1.length() != str2.length()) {
                System.out.println("Strings must be of equal length for this comparison.");
                return;
            }
            boolean isEqual = true;
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    isEqual = false;
                    break;
                }
            }
            if (isEqual) {
                System.out.println("The strings are equal.");
            } else {
                System.out.println("The strings are not equal.");
            }
        }
    }

