
import java.util.*;

class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); 
        list.add(9); 
        list.add(4); 
        list.add(2); 
        list.add(910); 
        list.add(922); 

        System.out.println(list);
        Collections.sort(list, reverseOrder());
        System.out.println(list);

    }
}