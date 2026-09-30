// import java.util.*;

public class ArrayCC {

    public static void update(int marks[]) {
        for (int i = 0 ; i < marks.length; i++) {
            marks[i] = marks[i] + 1; 
        }
    }

    public static int linearSearch(int num[],int key) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == key) {
                return i; 
            }           
        }
        return -1;
    }

    public static int largestNum(int num[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (largest < num[i]) {
                largest = num[i];
            }
            if (smallest > num[i]) {
                smallest = num[i];
            }
        }
        System.out.println("Smallest value is : " + smallest);
        return largest;
    }

    public static void main(String args[]) {
    // Your code here
        // int marks[] = {23, 34, 55};

        // Scanner sc = new Scanner(System.in);

        // update(marks);

        // for (int i = 0 ; i < marks.length; i ++) {
        //     System.out.print(marks[i] + " ");
        // }
        // System.out.println();



        int key = 30;
        int num[] = {1, 2, 4, 5, 6, 33, 10, 23};

        int result = linearSearch(num, key);

        // if (result == -1 ) {
        //     System.out.print("Not Found");
        // } else {
        //     System.out.println("Found at index:" + result);
        // }


        int largest = largestNum(num);
        System.out.println("Largest number in the array is:" + largest);

        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();
        // marks[2] = sc.nextInt();

        // System.out.println("phy : " + marks[0]);
        // System.out.println("chem : " + marks[1]);
        // System.out.println("math : " + marks[2]);
    }
}