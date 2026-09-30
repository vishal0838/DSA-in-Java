
public class BinarySearch {

    public static int binarySearch(int num[], int key) {
        int start = 0; 
        int end = num.length - 1;
        
        while (start <= end) {
            int mid = (start + end)/2;
            if (num[mid] == key) {
                return mid;
            }
            if(num[mid] > key) {
                end = mid - 1; 
            }
            if (num[mid] < key) {
                start = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        // Your code here
        int key = 33;
        int num[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int result = binarySearch(num, key);
        if (result == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Key is present at index: " + result);
        }
    }
}
