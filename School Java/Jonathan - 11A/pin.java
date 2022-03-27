//Jonathan Rufus Samuel
//11A
import java.util.Scanner;
class pin
{
    public static void main()
    {
        Scanner input = new Scanner(System.in);
        String ar1[] = new String[10];
        int ar2[] = new int[10];
        System.out.println("Enter ten cities");
        for(int i=0; i<10; i++)
        {
            ar1[i] = input.nextLine();
        }
        System.out.println("Enter the pincodes of the ten cities");
        for(int i=0; i<10; i++)
        {
            ar2[i] = input.nextInt();
        }
        //search begins here
        int found = 0,place = 0;
        System.out.println("Enter city to get it's pincode");
        String x = input.nextLine();
        for(int i=0; i<10; i++)
        {
            if(x==ar1[i])
            {
                found++;
                place = i;
            }
        }
        if(found == 1)
        {
             System.out.println("The pincode is "+ar2[place]);
            }
            else
            {
                System.out.println("Invalid Entry");
            }
    }
}
/*
Enter ten cities
Bangalore
Chennai
Mumbai
Delhi
Kolkata
Hyderabad
Jaipur
Kochi
Madurai
Goa
Enter the pincodes of the ten cities
560017
600018
230005
100002
520012
634522
594322
321000
340012
200345
Enter city to get it's pincode
Chennai
The pincode is 600018
 */