import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year and range (start end): ");
        int y=sc.nextInt(), start=sc.nextInt(), end=sc.nextInt();
        boolean leap = (y%400==0) || (y%4==0 && y%100!=0);
        if (leap && y>=start && y<=end) System.out.println("Leap year within range");
        else System.out.println("Condition not satisfied");
    }
}
