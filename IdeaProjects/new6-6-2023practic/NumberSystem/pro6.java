package NumberSystem;

import java.util.Scanner;
public class pro6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number");
        double a = sc.nextDouble();
        System.out.println("Enter second number");
        double b = sc.nextDouble();
        System.out.println("Addition is "+ (a+b));
        System.out.println("Subtraction is "+ (a-b));
        System.out.println("multiplication is "+ (a*b));
        System.out.println("Division is "+ (a/b));
        System.out.println("Mod is "+ (a%b));
    }
}
