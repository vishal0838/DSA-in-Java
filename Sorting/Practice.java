public class Practice {

    public static void Bubble (int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1] ) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1]; 
                    arr[j + 1] = temp; 
                }
            }
        }
    } 

    public static void Selection(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int minPos = i; 
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j; 
                }
            }
            int temp = arr[minPos]; 
            arr[minPos] = arr[i]; 
            arr[i] = temp;
        }
    }

    public static void Insertion(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int currPos = arr[i]; 
            int prev = i - 1; 
            while (prev >= 0 && arr[prev] > currPos) {
                arr[prev + 1] = arr[prev]; 
                prev--; 
            }
            arr[prev + 1] = currPos; 
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); 
        }
        System.err.println();
    }
    public static void main(String args[]) {
        int arr[] = {3 , 6, 2, 1, 8, 7, 4, 5, 3, 1}; 

        Insertion(arr);
        printArray(arr);
    }
}