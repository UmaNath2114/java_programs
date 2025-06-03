public class Array6 {
    public static void main(String[] args) {
        int[][] marks ={{73,1},{81,2},{37,32}};
        int r,c;
        System.out.println("two elements are:");
        for(r=0;r<3;r++){
            for(c=0;c<2;c++){
                System.out.print(marks[r][c]+" ");
            }
            System.out.println(" ");
        }
    }
}
