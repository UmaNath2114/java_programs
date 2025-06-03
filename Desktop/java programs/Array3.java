import java.util.Arrays;

public class Array3 {
    public static void main(String[] args) {
        int[] eveArr = new int[50];
        int[] oddArr = new int[50];
        int eveid = 0, oddid = 0;
        for (int val = 500; val < 600; val++) {
            if (val % 2 == 0) {
                eveArr[eveid] = val;
                eveid++;
            } else {
                oddArr[oddid] = val;
                oddid++;
            }
        }
        for (int ev : eveArr) {
           System.out.print(ev+" ");
        }
        System.out.println(" ");
        for(int od:oddArr){
            System.out.print(od+" ");
        }
    }
}
