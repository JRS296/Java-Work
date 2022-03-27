import java.io.*;
import java.util.Scanner;

class InvalidNameException extends Exception {
    public InvalidNameException(String str) {
        super(str); // calling the constructor of parent Exception
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String str) {
        super(str); // calling the constructor of parent Exception
    }
}

class InvalidContactException extends Exception {
    public InvalidContactException(String str) {
        super(str); // calling the constructor of parent Exception
    }
}

class InvalidCountryException extends Exception {
    public InvalidCountryException(String str) {
        super(str); // calling the constructor of parent Exception
    }
}

public class UserExceptionAss {
    public static void checkName(String name) throws InvalidNameException {
        int len = name.length();
        int flag = 0;
        for (int i = 0; i < len; i++) {
            if (Character.isDigit(name.charAt(i))) {
                flag = 1;
                System.out.println("Error Code 1: Invalid Name");
                throw new InvalidNameException("Invalid Name Entered");
            } else {
               continue;
            }
        }
        if(flag == 0)
        {
            System.out.println("Name verified Successfully");
        }
    }

    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Error Code 2: Invalid Age");
        } else {
            System.out.println("Age verified Successfully");
        }
    }

    public static void checkPhone(long phone) throws InvalidContactException {
        int count = String.valueOf(phone).length();
        System.out.println(count);
        if (count != 10) {
            // throw an object of user defined exception
            throw new InvalidContactException("Error Code 3: Invalid Phone number");
        } else {
            System.out.println("Contact Details verified Successfully");
        }
    }

    public static void checkCountry(String country) throws InvalidCountryException {
        if (country.equalsIgnoreCase("India") != true) {
            // throw an object of user defined exception
            throw new InvalidCountryException("Error Code 4: Not from India");
        } else {
            System.out.println("Country verified Successfully");
        }
    }

    public static void main(String[] args) {

        String name;
        int age;
        long phone;
        String country;

        try {
            InputStreamReader r = new InputStreamReader(System.in);
            Scanner s = new Scanner(System.in);
            BufferedReader br = new BufferedReader(r);
            System.out.println("Enter your name");
            name = br.readLine();
            System.out.println("Enter your Age");
            age = s.nextInt();
            System.out.println("Enter your phone nymber");
            phone = s.nextLong();
            System.out.println("Enter your Country of Residence");
            country = br.readLine();

            try {
                
                checkName(name);
                checkAge(age);
                checkPhone(phone);
                checkCountry(country);

            } catch (InvalidNameException e1) {
                System.out.println("Exception occured: " + e1);  
            } catch (InvalidAgeException e2) {
                System.out.println("Exception occured: " + e2);  
            } catch (InvalidContactException e3) {
                System.out.println("Exception occured: " + e3);  
            } catch (InvalidCountryException e4) {
                System.out.println("Exception occured: " + e4);  
            }
        } catch (IOException e) {
            System.out.println("IOException (due to Buffered Reader Handled");
        }
        finally
        {
            System.out.println("End of Code");
        }
    }
}

/*
 * Difference between DataInputStream and BufferedReader
 * The differences are:
 * 
 * - The DataInputStream works with the binary data, while the BufferedReader
 * work with character data.
 * 
 * - All primitive data types can be handled by using the corresponding methods
 * in DataInputStream class, while only string data can be read from
 * BufferedReader class and they need to be parsed into the respective
 * primitives.
 * 
 * - DataInputStream is a part of filtered streams, while BufferedReader is not.
 * 
 * - DataInputStream consumes less amount of memory space being it is binary
 * stream, where as BufferedReader consumes more memory space being it is
 * character stream.
 * 
 * - The data to be handled is limited in DataInputStream, where as the number
 * of characters to be handled has wide scope in BufferedReader.
 */