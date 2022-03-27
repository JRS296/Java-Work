//Jonathan Rufus Samuel
//11A - 11120 (Pakenham Walsh)
//program to number of vowels in a word using recursion
import java.util.Scanner;
public class str_vowel
{ 
    // Function to check the Vowel 
    static int isVowel(char ch) 
    { 
        ch = Character.toUpperCase(ch); 
        if(ch=='A' || ch=='E' || ch=='I' || 
        ch=='O' || ch=='U')  
            return 1; 
        else 
            return 0; 
    } 
    // to count total number of vowel from 0 to n 
    static int countVowels(String str, int n) 
    { 
        if (n == 1) 
            return isVowel(str.charAt(n - 1)); 
        return countVowels(str, n-1) + isVowel(str.charAt(n - 1)); 
    } 
    // Main Calling Function 
    public static void main(String args[])//main method begins
    { 
        System.out.println("Enter a string");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine(); //inputs value from user
        // Total numbers of Vowel 
        System.out.println(countVowels(str,str.length())); 
    }//main method ends
} 
/*
Enter a string
chicken
2

Enter a string
ambigious
5

 */