import java.util.Scanner;
public class Q27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter grade (A-F): ");
        char g=sc.next().toUpperCase().charAt(0);
        switch(g) {
            case 'A': System.out.println("Excellent"); break;
            case 'B': System.out.println("Good"); break;
            case 'C': System.out.println("Average"); break;
            case 'D': System.out.println("Below average"); break;
            case 'E': System.out.println("Poor"); break;
            case 'F': System.out.println("Fail"); break;
            default: System.out.println("Invalid grade");
        }
    }
}
