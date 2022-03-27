import java.util.*;

public class arraylistdemo {
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        Iterator itr = list.iterator();

        System.out.println(itr.hasNext());
        System.out.println(itr.hasNext());
        System.out.println(itr.hasNext());
        System.out.println(itr.hasNext());
        System.out.println(itr.hasNext());
        System.out.println(itr.hasNext());
    }
}
