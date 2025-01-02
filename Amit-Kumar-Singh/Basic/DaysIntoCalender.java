import java.util.Scanner;
public class DaysIntoCalender {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of days: ");
        int days = sc.nextInt();
        int years = days%365;
        days -= years*365;
        int months = days%30;
    }    
}
