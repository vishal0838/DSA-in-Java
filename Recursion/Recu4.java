class Recu4 {

    //Check if array is sorted or not...?

    public static boolean  isSorted(int i, int arr[]) {

        if (i == arr.length - 1) {
            return true;
        }

        if (arr[i] > arr[i + 1]) {
            return false; 
        }

        return isSorted(i + 1, arr);
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 6, 4, 5}; 

        int i = 0; 

        boolean ans = isSorted(i, arr);
        
        if (ans == true) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }
}