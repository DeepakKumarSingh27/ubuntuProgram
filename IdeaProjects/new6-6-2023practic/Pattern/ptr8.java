package Pattern;

import java.util.Scanner;

public class ptr8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >0; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
