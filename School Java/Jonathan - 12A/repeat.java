//Name: Jonathan Rufus Samuel
//Roll no: 12120
//Class: 12 'A'
//Computer Science Project - Question 17(Program to remove repeated characters in a string)
import java.util.*;   
class repeat  //initialization of class
{ 
    static String removeDuplicate(char str[], int n) 
    { 
        // Used as index in the modified string 
        int index = 0; 
        // Traverse through all characters 
        for (int i = 0; i < n; i++) 
        { 
            // Check if str[i] is present before it  
            int j; 
            for (j = 0; j < i; j++)  
            { 
                if (str[i] == str[j]) 
                { 
                    break; 
                } 
            } 
            // If not present, then add it to 
            // result. 
            if (j == i)  
            { 
                str[index++] = str[i]; 
            } 
        } 
        return String.valueOf(Arrays.copyOf(str, index)); 
    } 
    // Driver code 
    public static void main(String[] args) //main method
    { 
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string to remove repeated characters");
        String st = in.nextLine();
        char str[] = st.toCharArray(); 
        int n = str.length; 
        System.out.println(removeDuplicate(str, n)); 
    } //end of main method
}//end of class
/*
Enter a string to remove repeated characters
jaaaavvvvvvaaaaa
java

Enter a string to remove repeated characters
Kooeeenniggsseeegggg
Koenigseg

Enter a string to remove repeated characters
aaaarrrrrmmmmyyyy
army
 */