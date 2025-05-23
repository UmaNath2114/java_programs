//Accepting first portion as 400 and second portion from 01 to 99 and display 5 numbers in a row
public class MMain {
    public static void main(String[] args) {
        int count = 0;
        String x = "4000";
        for (int i = 1; i <= 99; i++) {
            System.out.printf(x + "%02d ", i);
            count++;
            if (count % 5 == 0) {
                System.out.println();
            }
        }
    }
}

