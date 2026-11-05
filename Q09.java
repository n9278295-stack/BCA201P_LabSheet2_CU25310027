import java.util.Scanner;
public class Q09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String a = sc.nextLine();
        System.out.print("Enter second string: ");
        String b = sc.nextLine();
        int i=0, result=0, len=Math.min(a.length(), b.length());
        while (i<len && result==0) {
            char x=a.charAt(i), y=b.charAt(i);
            if (x<y) result=-1;
            else if (x>y) result=1;
            i++;
        }
        if (result==0) {
            if (a.length()<b.length()) result=-1;
            else if (a.length()>b.length()) result=1;
        }
        if (result<0) System.out.println("First string comes before second");
        else if (result>0) System.out.println("First string comes after second");
        else System.out.println("Both strings are equal");
    }
}
