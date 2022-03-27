//Name: Jonatham Rufus Samuel
// 11'A'

import java.util.Scanner;
class palindrome
{
    static int copy;
    static int reverse = 0;
    static int n;
    static int reverse(int num)//Method to find reversed number
    {
        copy = num;
        while(copy>0)//extracts reversed values
        {
            n = copy%10;
            reverse = (reverse*10)+n;
            copy/=10;
        }
        return reverse;
    }
    public static void main()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = input.nextInt();
        palindrome obj = new palindrome();
        int rev;
        for (int a =1; a<= 10; a++)//repeats 10 times
        {
            System.out.println("Step"+" "+a+"   ");
            System.out.println("Number:" + number);
            rev = obj.reverse(number);
            System.out.println("Reverse: "+rev);
            if (rev==number)
            {
                System.out.println("Number is a palindrome");
                break;
            }
            else //reassigns sum of orginal number
            {
                reverse = 0;
                number+=rev;
                System.out.println("Sum of the orginal number and reverse: "+number);
            }
        }
    }
}

/*
 * Please enter a number
99
Step 1   
Number:99
Reverse: 99
Number is a palindrome

Please enter a number
32
Step 1   
Number:32
Reverse: 23
Sum of the orginal number and reverse: 55
Step 2   
Number:55
Reverse: 55
Number is a palindrome

Please enter a number
574
Step 1   
Number:574
Reverse: 475
Sum of the orginal number and reverse: 1049
Step 2   
Number:1049
Reverse: 9401
Sum of the orginal number and reverse: 10450
Step 3   
Number:10450
Reverse: 5401
Sum of the orginal number and reverse: 15851
Step 4   
Number:15851
Reverse: 15851
Number is a palindrome
 */