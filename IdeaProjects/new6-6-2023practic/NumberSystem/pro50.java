package NumberSystem;

import java.util.Scanner;

public class pro50 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int dg = digitCount(n);
        System.out.println(dg);
    }

    private static int digitCount(int n) {
        int ct=0;
        do {
            int d = n%10;
            ct++;
            n/=10;
        }while (n!=0);
        return ct;
    }
}
