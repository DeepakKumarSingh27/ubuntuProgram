package NumberSystem;

import java.util.Scanner;

public class pro25 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int sum =0,temp =n;
        for (int i = 1; i <= n/2; i++) {
           if (n % i ==0)
               sum += i;
        }
        if (sum == temp)
            System.out.println("perfect number");
        else System.out.println("not perfect number");
    }
}
