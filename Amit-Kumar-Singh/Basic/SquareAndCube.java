import java.util.Scanner;
public class SquareAndCube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt();
        System.out.println("Square of given number: "+(num*num)+"\nCube of given number: "+(num*num*num));
        sc.close();
    }
}
