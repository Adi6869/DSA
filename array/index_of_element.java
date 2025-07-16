
import java.util.Scanner;

public class index_of_element {
    public static void main(String[] args) {
        int[] arr = {15, 25, 35, 45, 55};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find its index: ");
        int target = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Element " + target + " found at index: " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}