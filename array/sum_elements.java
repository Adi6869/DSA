
public class sum_elements {

    public static void main(String[] args) {
        //3. Sum of elements in an array:
        int[] num = {20, 10, 50, 9, 13, 24, 1};
        int sum = 0;
        System.out.println("Sum: ");
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        System.out.println(sum);

    }
}
