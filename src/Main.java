import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new FileReader("sleepy.in"));
        PrintWriter pw = new PrintWriter("sleepy.out");

        int n = sc.nextInt();
        int[] order = new int[n];
        for (int i = 0; i < n; i++) {
            order[i] = sc.nextInt();
        }

        for (int i = n-1; i > 0; i--) {
            if (order[i] < order[i-1]) {
                pw.println(i);
                pw.close();
                System.exit(0);
            }
        }
        pw.println(0);
        pw.close();
    }
}
