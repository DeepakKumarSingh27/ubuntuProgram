package NumberSystem;

import java.util.Scanner;

public class pro39 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int prod =1;
        do {
            int d = n % 10;
            prod *= d;
            n /= 10;
        }while (n !=0);
        System.out.println(prod);
    }
}
