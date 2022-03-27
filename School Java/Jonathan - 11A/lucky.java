//Jonathan Rufus Samuel
//11A

import java.util.Scanner;
class lucky
{
    public static int counter = 2;     
    // Returns 1 if n is a lucky no. ohterwise returns 0 
    static boolean find_lucky(int n) 
    { 
        // variable next_position is just for readability of 
        // the program we can remove it and use n only  
        int next_position = n; 
        if(counter > n) 
            return true; 
        if(n%counter == 0) 
            return false;       
        // calculate next position of input no 
        next_position -= next_position/counter; 
        counter++; 
        return find_lucky(next_position); 
    } 
    public static void main()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number less than 50");
        int x = input.nextInt();
        lucky obj = new lucky();//creation of object
        boolean ans = obj.find_lucky(x);
        if(ans==true)
            System.out.println("It is a lucky number");
        else if(ans==false)
            System.out.println("It is not a lucky number");
    }
}
/*
Enter a number less than 50
5
It is not a lucky number

Enter a number less than 50
19
It is a lucky number

 */