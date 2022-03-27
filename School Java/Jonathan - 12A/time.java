//Name: Jonathan Rufus Samuel
//Roll no: 12120
//Class: 12 'A'
//Computer Science Project - Question 23(Program to display time in word form)
import java.util.Scanner;
class time//initialization of class
{ 
    // Print Time in words. 
    static void printWords(int h, int m) 
    { 
        String nums[] = { "zero", "one", "two", "three", "four", 
                "five", "six", "seven", "eight", "nine", 
                "ten", "eleven", "twelve", "thirteen", 
                "fourteen", "fifteen", "sixteen", "seventeen", 
                "eighteen", "nineteen", "twenty", "twenty one", 
                "twenty two", "twenty three", "twenty four", 
                "twenty five", "twenty six", "twenty seven", 
                "twenty eight", "twenty nine", 
            }; //array of number names
        if (m == 0) 
            System.out.println(nums[h] + " o' clock "); 

        else if (m == 1) 
            System.out.println("one minute past " +  
                nums[h]); 

        else if (m == 59) 
            System.out.println("one minute to " +  
                nums[(h % 12) + 1]); 

        else if (m == 15) 
            System.out.println("quarter past " + nums[h]); 

        else if (m == 30) 
            System.out.println("half past " + nums[h]); 

        else if (m == 45) 
            System.out.println("quarter to " +  
                nums[(h % 12) + 1]); 

        else if (m <= 30) 
            System.out.println( nums[m] + " minutes past " + 
                nums[h]); 

        else if (m > 30) 
            System.out.println( nums[60 - m] + " minutes to " +      
                nums[(h % 12) + 1]); 
    } 
    public static void main(String []args) //main method
    { 
        Scanner input = new Scanner(System.in);
        System.out.println("Enter time, inputting two integers, with the first depicting");
        System.out.println("the hours(1 to 12) and the second depicting the minutes(0 to 59)");
        int h = input.nextInt();
        int m = input.nextInt();
        if((h>=1&&h<=12)&&(m>=0&&m<=59))
        {
            if(m>=0&&m<10)
            {
                System.out.print(h+":0"+m+" ");
            }
            else
            {
                System.out.print(h+":"+m+" ");
            }
            printWords(h, m); 
        }
        else
        {
            System.out.println("INCORRECT INPUT");
        }
    } //end of main method
}//end of class 

/*
Enter time, inputting two integers, with the first depicting
the hours(1 to 12) and the second depicting the minutes(0 to 59)
4
5
4:05 five minutes past four

Enter time, inputting two integers, with the first depicting
the hours(1 to 12) and the second depicting the minutes(0 to 59)
12
34
12:34 twenty six minutes to one

Enter time, inputting two integers, with the first depicting
the hours(1 to 12) and the second depicting the minutes(0 to 59)
9
3
9:03 three minutes past nine

Enter time, inputting two integers, with the first depicting
the hours(1 to 12) and the second depicting the minutes(0 to 59)
6
59
6:59 one minute to seven

Enter time, inputting two integers, with the first depicting
the hours(1 to 12) and the second depicting the minutes(0 to 59)
14
38
INCORRECT INPUT

 */