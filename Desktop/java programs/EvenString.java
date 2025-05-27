public class EvenString {
    // Java program to print even length words in a string
        public static void printWords(String s)
        {
            for (String w : s.split(" ")){
                // if length is even
                if (w.length() % 2 != 0)
                    System.out.println(w +" - "+ w.length());
            }
        }

        public static void main(String[] args)
        {
            String s = "i am belongs to ECE Branch";
            printWords(s);
        }
    }
