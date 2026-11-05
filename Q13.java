import java.util.Scanner;
public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch=sc.next().charAt(0);
        String type = !Character.isLetterOrDigit(ch) ? "Special symbol" :
            (Character.isDigit(ch) ? "Digit" :
            ("aeiouAEIOU".indexOf(ch)>=0 ? "Vowel" : "Consonant"));
        System.out.println(type);
    }
}
