import java.util.*;

public class reverse_arraylist {
    public static void main(String[] args) {
        // Step 1: Create the ArrayList
        ArrayList<Integer> ab = new ArrayList<>();

        // Step 2: Add elements
        ab.add(8);
        ab.add(9);
        ab.add(6);
        ab.add(5);
        int max=Integer.MIN_VALUE;


        // Step 3: Print original list
        for(int i=0;i< ab.size();i++){
            System.out.println(ab.get(i));

        }

        for(int i=ab.size()-1;i>=0;i--){
            System.out.print(ab.get(i));
        }
    }
}
