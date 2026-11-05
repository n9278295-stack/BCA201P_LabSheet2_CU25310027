import java.util.Scanner;
public class Q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n=sc.nextInt(), temp=n;
        while (temp>1 && temp%4==0) temp >>= 2;
        boolean powerOf4=(n>0 && temp==1);
        System.out.println("Power of 4: " + powerOf4);

        int toggled=n^(1<<2);
        System.out.println("After toggling 3rd bit: " + toggled);

        for (int i=1; i<=20; i++) {
            int product=n*i;
            if (product%48==0) break;
            if (product%6==0) continue;
            System.out.println(n + " x " + i + " = " + product);
        }
    }
}
