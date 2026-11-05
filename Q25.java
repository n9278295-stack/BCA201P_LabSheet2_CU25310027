public class Q25 {
    public static void main(String[] args) {
        int[][] marks={{80,70,90},{60,75,85},{90,95,80}};
        int total=0, count=0;
        for (int[] row:marks)
            for (int mark:row) { total+=mark; count++; }
        System.out.println("Average marks = " + (total/(double)count));
    }
}
