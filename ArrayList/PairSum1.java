import java.util.*; 

class PairSum1 {

    //Brute Force
    public static void pairSum(ArrayList<Integer> pair, int target) {
        for (int i = 0; i < pair.size(); i++) {
            for (int j = i + 1; j < pair.size(); j++) {
                if ((pair.get(i) + pair.get(j)) == target) {
                    System.out.print("(" + pair.get(i) + "," + pair.get(j) + ")");
                }
            }
        }
        
    } 

    //Optimized 
    public static boolean  pairSum2(ArrayList<Integer> pair, int target) {
        int maxValue = 0; 
        int lp = 0; 
        int rp = pair.size() - 1;

        while ( lp < rp) {
            if (pair.get(lp) + pair.get(rp) == target) {
                return true; 
            }

            else if (pair.get(lp) + pair.get(rp) < target) {
                lp++; 
            }

            else {
                rp--; 
            }
        } 

        return false; 
    } 
    public static void main(String[] args) {
        ArrayList<Integer> pair = new ArrayList<>(); 

        pair.add(1); 
        pair.add(2);
        pair.add(3);
        pair.add(4);
        pair.add(5);
        pair.add(6);

        int target = 5; 

        System.out.println(pairSum2(pair, target));

        
        
    }
}