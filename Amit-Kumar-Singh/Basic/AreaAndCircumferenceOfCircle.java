import java.util.Scanner;
public class AreaAndCircumferenceOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        int radius = sc.nextInt();
        System.out.println("Area of the given circle: "+(Math.PI*(radius^2))+"\nThe circumference of the circle: "+(2*Math.PI*radius));
        sc.close();
    }
}
