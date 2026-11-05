import java.util.Scanner;
public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter theory, practical and overall marks (%): ");
        double t=sc.nextDouble(), p=sc.nextDouble(), o=sc.nextDouble();
        if ((t>=40 && p>=50) || o>=50) System.out.println("Pass");
        else System.out.println("Fail");
    }
}
