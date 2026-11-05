import java.util.Scanner;
public class Q07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        System.out.println("Enter rainfall for 7 days:");
        for (int i=1; i<=7; i++) {
            System.out.print("Day " + i + ": ");
            total += sc.nextDouble();
        }
        System.out.println("Total rainfall = " + total);
    }
}
