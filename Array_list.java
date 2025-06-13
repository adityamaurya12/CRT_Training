import java.util.*;
public class Array_list {
    public static void main(String[] args) {
        ArrayList <Integer> ab =new ArrayList<>();
        ab.add(8);
        ab.add(9);
        ab.add(10);
        ab.add(90);
        for(int i=0;i<ab.size();i++)
        {
            System.out.println(ab.get(i));
        }
        ab.add(1,10);
        int a=ab.size();
        System.out.println(ab);
        System.out.println(a);
        //element is get by index
        System.out.println(ab.get(2));
        ab.remove(2);
        System.out.println(ab);
        //element is prsent in the required list.
        System.out.println(ab.contains(4));

    }
}
