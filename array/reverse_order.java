//Print array in reverse order.
public class reverse_order {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};

        System.out.println("Array in reverse order:");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
    }
}
