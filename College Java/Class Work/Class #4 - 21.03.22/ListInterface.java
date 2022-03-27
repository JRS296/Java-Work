import java.util.*;

public class ListInterface {
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<Integer>();
        //List<Integer> list = new Vector<Integer>();
        List<Integer> list1 = new ArrayList<Integer>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);

        System.out.println("Current List: "+list);

        list.add(2, 40);
        System.out.println("Current List: "+list);

        System.out.println("Is 10 present? "+list.contains(10));

        list.remove(0);//Index
        System.out.println("Current List: "+list);

        /*for(int i:list)
        {
            System.out.println("Index: "+list.get(i));
        }*/
        list.addAll(list1);
        System.out.println("Adding another List: "+list);

        Iterator<Integer> it = list.iterator();
        while(it.hasNext());
        {
            System.out.println(it.next());
        }
    }
    
}
