class LastOccur {

    public static int lastO(int arr[], int key , int i) {
        if (i == 0) {
            return -1;
        }

        if (arr[i] == key) {
            return i; 
        }

        return lastO(arr, key, i - 1); 
    }
    public static void main(String args[]) {
        int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3, 5}; 
        int i = arr.length - 1; 


        System.out.println(lastO(arr, 5, i));
    }
}