// string methods
public class Prog4 {
    public static void main (String[]args){
        String st = new String("india");
        System.out.println(st.toUpperCase());
        String st1 = new String("INDIA");
        System.out.println(st1.toLowerCase());
       System.out.println(st.length());
        System.out.println(st1.length());
        System.out.println(st+st1);
        String original = st;
        String reversed = new StringBuilder(original).reverse().toString();
        System.out.println("Reversed: " + reversed);
//        //without inbuilt metdod
//        for(int i=st.length()-1;i>=0;i++){
//            System.out.println(st.charAt(i));
        }
    }

