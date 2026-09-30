public class LinearSeacrch {

    public static int linearS(int num[], int key) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == key) {
                return  i;
            }
        }

        return -1; 
    }

    public static void main(String[] args) {
        int num[] = {1, 2, 4, 5, 6, 7, 8, 9};

        int key = 5;

        int index = linearS(num, key);

        if (index == -1) {
            System.out.println("Key not found");
        } else {
            System.err.println("Key is present at index: " + index);
        }

        

    }
}