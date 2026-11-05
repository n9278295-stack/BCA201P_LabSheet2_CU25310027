public class Q04 {
    public static void main(String[] args) {
        int visitors = 0;
        System.out.println("Visitors entering: " + (++visitors));
        System.out.println("Visitors leaving: " + (visitors--));
        System.out.println("Current visitors: " + visitors);
    }
}
