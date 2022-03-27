//Name: Jonathan Rufus Samuel
//Roll no: 12120
//Class: 12 'A'
//Computer Science Project - Question 20(Program to check if word is elfish or not)
import java.util.Scanner;
class elfish
{
    void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter word to check if elfish or not");
        String s = in.nextLine();
        int l = s.length();
        char ar[] = new char[l];
        for(int i=0; i<l; i++)
        {
            ar[i] = s.charAt(i);
        }
        elfish obj = new elfish();
        int r = obj.elf(ar,0,0);
        if(r==1)
        {
            System.out.println("It is an elfish word");
        }
        else
        {
            System.out.println("It is not an elfish word");
        }
    }

    int elf(char ch[],int n,int p)
    {
        if(ch[p]=='e'||ch[p]=='l'||ch[p]=='f')
        {
            n++;       
            return 1;
        }
        else
        {
            return elf(ch,n,p);
        }

    }
}

/*
Enter word to check if elfish or not
elfish
It is an elfish word

Enter word to check if elfish or not
millet
It is an elfish word

Enter word to check if elfish or not
ant
It is not an elfish word

 */