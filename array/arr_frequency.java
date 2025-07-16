//Count frequency of a given number.
import java.util.Scanner;

public class arr_frequency {
    public static void main(String[] args) {
        int[] a = {10, 20, 10, 30, 10, 40, 50, 20};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to count frequency: ");
        int target = sc.nextInt();

        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                count++;
            }
        }
        System.out.println("Frequency of " + target + " is: " + count);
    }
}