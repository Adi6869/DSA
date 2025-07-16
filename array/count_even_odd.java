
public class count_even_odd {

    public static void main(String[] args) {
        int[] arr = {10, 25, 13, 40, 9, 6, 3};
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
        int even_count = 0;
        int odd_count = 0;

        for (int i = 0; i < len; i++) {
            if (i % 2 == 0) {
                even_count++;
            } else {
                odd_count++;
            }
        }
        System.out.println("Number of Even Numbers: " + even_count);
        System.out.println("Number of Odd numbers: " + odd_count);
    }
}
