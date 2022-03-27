//Name: Jonathan Rufus Samuel
//Roll no: 12120
//Class: 12 'A'
//Computer Science Project - Question 22(Program to print bill using super class)
import java.util.Scanner;
class Bill extends Detail//initialization of base class
{
    int n;
    int amt;
    void Bill()
    {
        amt = 0;
        n = 0;
    }
    double cal(int num,int rental)//method to calculate final amount to be paid
    {
        double finamt=0.0;
        if(num>0 && num<=100)
        {
            finamt = rental;
        }
        else if(num>100 && num<=200)
        {
            finamt = rental + (0.6*num);
        }
        else if(num>200 && num<=300)
        {
            finamt = rental + (0.8*num);
        }
        else if(num>300)
        {
            finamt = rental + (num);
        }
        else
        {
            System.out.println("Invalid entry");
        }
        return finamt;
    }

    void main()//main function
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name of Customer: ");
        String nam = input.nextLine();
        System.out.println("Enter address: ");
        String ad = input.nextLine();
        System.out.println("Enter Contact number: ");
        int no = input.nextInt();
        System.out.println("Enter rental charge: ");
        int amount = input.nextInt();
        System.out.println("Enter number of calls made: ");
        n = input.nextInt();

        Bill obj = new Bill();
        obj.Detail(nam,ad,no,amount);
        double ans = obj.cal(n,amount);
        obj.show();
        System.out.println("Total amount to be paid: \t"+ans);
    }//end of main function
}//end of class

class Detail //superclass
{
    String name = "";
    String address = "";
    int telno = 0;
    int rent =0;
    void Detail(String nam,String ad,int no,int amount)
    {
        name = nam;
        address = ad;
        telno = no;
        rent = amount;
    }
    void show()
    {
        System.out.println("Name of the Customer: \t"+name);
        System.out.println("Address of the Customer: \t"+address);
        System.out.println("Contact number of Customer: \t"+telno);
        System.out.println("Rental amount to be paid: \t"+rent);
    }
}//end of super class

/*
Enter name of Customer: 
John
Enter address: 
India
Enter Contact number: 
98456473
Enter rental charge: 
500
Enter number of calls made: 
67
Name of the Customer: 	John
Address of the Customer: 	India
Contact number of Customer: 	98456473
Rental amount to be paid: 	500
Total amount to be paid: 	500.0

Enter name of Customer: 
Jonathan
Enter address: 
Bangalore
Enter Contact number: 
029372
Enter rental charge: 
499
Enter number of calls made: 
288
Name of the Customer: 	Jonathan
Address of the Customer: 	Bangalore
Contact number of Customer: 	29372
Rental amount to be paid: 	499
Total amount to be paid: 	729.4

 */