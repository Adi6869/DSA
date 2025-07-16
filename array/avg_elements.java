
import java.util.Scanner;

public class avg_elements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int len = a.length;

        for (int i = 0; i < len; i++) {
            a[i] = sc.nextInt();
        }
        int sum = 0;
        int avg = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            avg = sum / a.length;
        }
        System.out.println("Average: " + avg);

    }
}
