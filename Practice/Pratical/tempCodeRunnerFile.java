import java.util.*;

public class Knapsack {

    public static int knapsack(int W, int wt[], int val[], int n) {
        int dp[][] = new int[n + 1][W + 1];

        for (int i = 1; i <= n; i++) {
            for (int w = 1; w <= W; w++) {

                if (wt[i - 1] <= w) {
                    dp[i][w] = Math.max(
                        val[i - 1] + dp[i - 1][w - wt[i - 1]],
                        dp[i - 1][w]
                    );
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        return dp[n][W];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 3; 

        // System.out.print("Enter number of items: ");
        

        int val[] = {60, 100, 120}; 
        int wt[] = {10, 20, 30};

        // System.out.println("Enter values of items:");
        // for (int i = 0; i < n; i++) {
        //     val[i] = sc.nextInt();
        // }

        // System.out.println("Enter weights of items:");
        // for (int i = 0; i < n; i++) {
        //     wt[i] = sc.nextInt();
        // }

        //System.out.print("Enter knapsack capacity: ");
        int W = 50; 

        System.out.println("Maximum value: " +
            knapsack(W, wt, val, n));

        // sc.close();
    }
}