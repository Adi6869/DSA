
import java.util.Scanner;

public class max_min {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int len = a.length;
        for (int i = 0; i < len; i++) {
            a[i] = sc.nextInt();
        }
        int maxValue = a[0];
        int minValue = a[0];

        for (int i = 0; i < len; i++) {
            if (a[i] > maxValue) {
                maxValue = a[i];
            }

            if (a[i] < minValue) {
                minValue = a[i];
            }
        }
        System.out.println("Maximum element: " + maxValue);
        System.out.println("Minimum element: " + minValue);
    }
}
