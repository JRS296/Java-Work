import java.util.Scanner;
class student
{
    
    
    public static void main(String args[])
    {
        int roll;
        int bio, chem, phy;
        int total;
        double percentage;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Student's roll number: ");
        roll = in.nextInt();
        System.out.println("Enter Biology marks: ");
        bio = in.nextInt();
        System.out.println("Enter Physics marks: ");
        phy = in.nextInt();
        System.out.println("Enter Chemistry marks: ");
        chem = in.nextInt();
        total = bio + chem + phy;
        percentage = total / 3;
        System.out.println("Total marks obtained: " + total);
        System.out.println("Percentage: " + percentage);
    }
}
