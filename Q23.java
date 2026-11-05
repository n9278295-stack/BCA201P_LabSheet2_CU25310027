import java.util.Scanner;
public class Q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n=sc.nextInt(), temp=n, rev=0;
        while (temp>0) { rev=rev*10+temp%10; temp/=10; }
        if (n>=0 && n==rev) System.out.println("Palindrome");
        else System.out.println("Not palindrome");
    }
}
