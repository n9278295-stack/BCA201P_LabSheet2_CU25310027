import java.util.Scanner;
public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n=sc.nextInt(), rev=0, temp=Math.abs(n);
        while (temp>0) { rev=rev*10+temp%10; temp/=10; }
        if (n<0) rev=-rev;
        System.out.println("Reversed = " + rev);
    }
}
