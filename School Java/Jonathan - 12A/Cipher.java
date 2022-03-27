//Name: Jonathan Rufus Samuel
//Roll no: 12120
//Class: 12 'A'
//Computer Science Project - Question 3(Program to Encrypt text)
import java.util.Scanner; 
class Cipher //initialization of class
{ 
    public static String encrypt(String text, int s) //method encrypt()
    { 
        String result =(""); 
        for (int i=0; i<text.length(); i++) 
        { 
            if (Character.isUpperCase(text.charAt(i))) //checks if character is upper case
            { 
                char ch = (char)(((int)text.charAt(i) + s - 65) % 26 + 65); 
                result += ch; 
            } 
            else if (Character.isLowerCase(text.charAt(i)))//checks if character is lower case
            { 
                char ch = (char)(((int)text.charAt(i) + s - 97) % 26 + 97); 
                result += ch; 
            } 
            else
            {
                char ch = text.charAt(i);
                result += ch;  
            }
        } 
        return result; 
    } //end of method encrypt()

    public static void main(String[] args) //main method
    { 
        Scanner input = new Scanner(System.in);
        System.out.println("Enter word to be ciphered");
        String text = input.nextLine();//inputs line to be ciphered
        int y = text.length();
        if(y>3 && y<100)//checks if length of inputted line is valid
        {
            System.out.println("The ciphered text is: " + encrypt(text, 13)); 
        }
        else
        {
            System.out.println("INVALID LENGTH");
        }
    } //end of main method
} //end of class

/*
Enter word to be ciphered
Hello! How are you?
The ciphered text is: Uryyb! Ubj ner lbh?

Enter word to be ciphered
Encryption helps to secure data.
The ciphered text is: Rapelcgvba urycf gb frpher qngn.

Enter word to be ciphered
You
INVALID LENGTH
*/