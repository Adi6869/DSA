
public class bubbleSort {

    public static void main(String[] args) {
        int[] a = {5, 9, 1, 4, 3, 6, 8};
        System.out.println("Array elements before sorting: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Array elements after sorting: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
