package Arrays1Dimension;
public class Arr14 {
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        System.out.println("Enter first Array size");
        int[] x= ao.ReadArray();
        System.out.println("Enter second Array size");
        int[] y= ao.ReadArray();
        int[] z= margedArray(x,y);
        System.out.println("merged Array is");
        ao.DisplayArray(z);
    }
}
