package KSirDataStructure;
public class EvenDigits {
    public static void main(String[] args) {
     int[] nums = {12,345,2,6,7896};
        System.out.println(digits2(12345));
    }
    public  static int findNumbers(int[] nums) {
       int count =0;
       for (int num : nums) {
           if (even(num)) {
               count++;
           }
       }
       return count;
    }

    public static boolean even(int num) {
      int numberOfDigits = digits(num);
      return numberOfDigits % 2 == 0;
    }
    static int digits(int num) {
        int count =0;
        while (num >0) {
            count++;
            num /=10;
        }
        return count;
    }
    static int digits2 (int num) {
       return  (int)(Math.log10(num)) + 1;
    }
}
