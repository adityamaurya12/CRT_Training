import java.util.*;
public class Swap_Number {
    public static void swap(List<Integer> list,int a,int b){
        int temp= list.get(a);
        list.set(a, list.get(b));
        list.set(b, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> ac=new ArrayList<>();
        ac.add(70);
        ac.add(90);
        ac.add(7);
        ac.add(8);
        System.out.println(ac);
        swap(ac,1,3);
        System.out.println(ac);
        //sorting arraylist
        Collections.sort(ac);
        //Collections.sort(ac);
        System.out.println(ac);
        //reversesorting in decending order
        Collections.sort(ac,Collections.reverseOrder());
        System.out.println(ac);



    }

}
