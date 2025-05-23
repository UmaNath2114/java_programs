public class Palindrome {
    public static void main (String[]args){
        String x="UMA";
        StringBuilder sc=new StringBuilder(x);
        String s=(sc.reverse().toString());
        System.out.println(s.equals(x));

    }
}
