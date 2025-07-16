
import java.util.*;

public class string_to_char {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String input = sc.nextLine();
        System.out.println("String: " + input);

        char[] ch = input.toCharArray();
        System.out.println("Using Loop: ");
        for (int i = 0; i < ch.length; i++) {
            System.out.println(ch[i] + " ");
        }
    }
}
