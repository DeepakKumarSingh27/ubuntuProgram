package Pattern;

import java.util.Scanner;

public class ptr16 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print((char) (j+96)+" ");
            }
            System.out.println();
        }
    }
}
