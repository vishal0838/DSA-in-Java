public class Pairs {

    public static void pairs(int num[]) {
        for (int i = 0; i < num.length-1; i++) {
            int curr = num[i];
            for (int j = i + 1; j < num.length - 1; j++){
                System.out.print("("+ curr + "," + num[j] + ")");
            }
            System.err.println();
        }
        
    }
    public static void main(String[] args) {
        // Your code here

        int num[] = {1, 2, 4, 5, 6, 7};

        pairs(num);

        
    };
}
