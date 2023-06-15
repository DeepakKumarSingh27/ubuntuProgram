package Arrays1Dimension;
import java.util.Scanner;
public class Arr5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter "+n+" values");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        int small = isSmallest(ar);
        System.out.println(small);
    }

    public static int isSmallest(int[] ar) {
        int small = ar[0];
        for (int i = 1; i < ar.length; i++) {
            if (small > ar[i])
                small = ar[i];
        }
        return small;
    }
}
