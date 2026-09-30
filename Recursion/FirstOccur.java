class FirstOccur {

    public static int firstO(int arr[], int key , int i) {
        if (i == arr.length) {
            return -1;
        }

        if (arr[i] == key) {
            return i; 
        }

        return firstO(arr, key, i + 1); 
    }
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5}; 


        System.out.println(firstO(arr, 5, 0));
    }
}