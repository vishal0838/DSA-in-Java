
import java.util.*;

public class Fibonnaci {

    static int steps = 0;

    // Iterative Approach
    public static void Itr(int n) {
        int a = 0;
        int b = 1;
        int c;
        int count = 0;

        System.out.print("Iterative series: ");

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
            count++;
        }

        System.out.println();
        System.out.println("Iterative steps count: " + count);
    }

    // Recursive Approach
    public static int Recur(int n) {
        steps++;

        if (n <= 1) {
            return n;
        }

        return Recur(n - 1) + Recur(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Enter a non-negative number.");
            sc.close();
            return;
        }

        Itr(n);

        steps = 0;
        System.out.print("Recursive series: ");

        for (int i = 0; i < n; i++) {
            System.out.print(Recur(i) + " ");
        }

        System.out.println();
        System.out.println("Recursive steps count: " + steps);

        sc.close();
    }
}
