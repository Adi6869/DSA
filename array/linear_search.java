
import java.util.Scanner;

public class linear_search {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = {20, 10, 50, 9, 13, 24, 1};
        System.out.println("Enter the target value:");
        int target = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < num.length; i++) {
            if (num[i] == target) {
                System.out.println("Element found at index:" + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }
    }
}
