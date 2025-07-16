
import java.util.Scanner;

public class in_out_arr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //2. Input and output elements
        System.out.println("Enter the size of the array: ");
        int input = sc.nextInt();
        int[] arr = new int[input];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
