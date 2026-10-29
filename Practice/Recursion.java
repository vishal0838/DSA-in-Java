class Recursion {

    public static int fact(int n) {
        if (n == 0) {
            return 1; 
        }

        return n * fact(n - 1); 
    }

    public static int sum(int n) {
        if (n == 1) {
            return n; 
        }
        return n + sum(n - 1); 
    }

    public static int fib(int n ) {
        int step = 0; 
        if (n == 0 || n == 1) {
            return n; 
        }
        step++; 
        System.err.println("Step: " + step);
        return fib(n - 2) + fib(n - 1); 

    }

    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true; 
        }

        if (arr[i] > arr[i + 1]) {
            return false; 
        }

        return isSorted(arr, i + 1); 
    }

    public static int occur(int arr[], int i, int target) {
        if (i == arr.length - 1) {
            System.out.println("Not found");
            return -1; 
        }

        if (arr[i] == target) {
            return i; 
        }

        return occur(arr, i + 1, target); 
    }
    public static void main(String[] args) {
        int n = 5; 

        int arr[] = {1, 2, 3, 7, 5}; 

        System.out.println(fib(n));
    }
}