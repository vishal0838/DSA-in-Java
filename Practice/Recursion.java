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
        if (n == 0 || n == 1) {
            return n; 
        }
        return fib(n - 2) + fib(n - 1); 

    }
    public static void main(String[] args) {
        int n = 5; 

        System.out.println("Fibonacci Sum of "+ n + " : "+fib(n));
    }
}