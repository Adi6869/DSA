
public class Recursion {

    public static void Hellomydear(int n) {
        if (n == 0) {
            return; //Base Case
        }
        System.out.println("Hello my dear zomato, how are you, This is .......");
        Hellomydear(n - 1);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Using Recursion: ");
        Hellomydear(n);

    }
}
