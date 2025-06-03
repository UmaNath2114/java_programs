public class Array2 {
    public static void main(String[] args) {
        int[] myArr={1,2,3,4,5};
        myArr[1] = myArr[1]+5;
        myArr[3] = myArr[3]+5;
        for(int c=0;c<5;c++){
            System.out.println(myArr[c]+" ");
        }
    }
}
