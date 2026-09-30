class Power {

    public static int power(int x, int n) {
        if (n == 0) {
            return 1; 
        }
        return x * power(x, n - 1); 
    }

    //Optimized 
    public static int oPower(int x, int n) {
        if (n == 0){
            return 1; 
        }
         int halfP = oPower(x, n/2) + oPower(x, n/2); 

        if (n % 2 != 0) {
            halfP = x * halfP; 
        }

        return halfP; 
    }
    public static void main(String[] args) {
        int x = 2; 
        int n = 5; 

        System.out.println(oPower(x, n));


    }
}