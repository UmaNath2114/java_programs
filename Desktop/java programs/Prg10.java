public class Prg10 {
    public static void main(String[] args) {
        int alpha = 65;
        while (alpha <= 90) {
            System.out.print((char)alpha + " ");
        alpha++;
        }
        alpha=alpha-1;
        System.out.println(" ");
        while(alpha>=65){
            System.out.print((char)alpha + " ");
            alpha--;
        }
    }
}