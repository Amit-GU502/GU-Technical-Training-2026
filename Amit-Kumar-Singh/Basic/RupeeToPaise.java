
import java.util.Scanner;
public class RupeeToPaise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amout of Rupees: ");
        float rupees = sc.nextFloat();
        float paise = rupees*100;
        System.out.println("Amount in Paise: "+paise);
        sc.close();
    }
}
