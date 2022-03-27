import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class MyException extends Exception
{
    private String str;
    public MyException(String str)
    {
        this.str = str;
    }

    public String toString()
    {
        return str;
    }
}

public class ListStuff {

    public void add(List<Integer> ex, int val)
    {
        ex.add(val);
        System.out.println("After Adding: "+ex);
    }

    public void addFront(List<Integer> ex, int val)
    {
        ex.add(0, val);
        System.out.println("After Adding: "+ex);
    }

    public void del(List<Integer> ex2, int val)
    {
        boolean flag = ex2.contains(val);
        if (flag)
        {
            ex2.remove(val);
            System.out.println("After Removing: "+ex2);
        }
        else
        {
            try {
                throw new MyException("Element Not Found");
            } catch (MyException e) {
                System.out.println(e.toString());
            }
        }
    }

    public void differences(List<Integer> ex3, List<Integer> ex4)
    {
        int count1 = ex3.size();
        int count2 = ex4.size();
        int abs = Math.abs(count1-count2);
        System.out.println("Absolute Difference: "+ abs);
    }

    public static void main(String[] args) {
        int m;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter n value for list of lists: ");
        int n = s.nextInt();

        //ArrayList<ArrayList<Integer>> obj = new ArrayList<ArrayList<Integer>>(n);
        List<Integer> list[] = new List[n];
        Random rand = new Random();

        for (int i=0; i<n; i++)
        {
            m = rand.nextInt(20);//Random size uptill 20
            list[i] = new ArrayList<>();

            for(int j=0; j<m; j++)
            {
                int y = rand.nextInt(5);
                list[i].add(y);
            }

            System.out.println("List "+i+": "+list[i]);
        }
        
        ListStuff obj = new ListStuff();
        obj.add(list[3], 54);
        obj.del(list[2], 1);
        obj.del(list[3], 1);
        obj.addFront(list[1], 67);
        obj.differences(list[2], list[4]);
    }
}