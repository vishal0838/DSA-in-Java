public class SubArray {

    public static void subArray(int num[]) {
        int ts = 0; 
        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                for (int k = i ; k <= j; k++) {
                    System.out.print(num[k] + " ");
                }
                ts++;
                System.out.println(" ");
                
            }
            System.out.println(" ");  
        }
        System.out.println("Total subarrays is: " + ts);

    }

    public static void main(String[] args) {
        int num[] = {1, 2, 3, 4}; // Kept it small for readable output
        subArray(num);
    }
}