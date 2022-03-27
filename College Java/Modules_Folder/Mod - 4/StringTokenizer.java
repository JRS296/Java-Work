import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//You can use the java.util.StringTokenizer (in the API reference documentation) or java.io.StreamTokenizer (in the API reference documentation)
// to parse your input into words. Each class has a default set of delimiters (like white space) that you can specify.

class StringProcessing {
    // Create BufferedReader class instance

    static InputStreamReader input = new InputStreamReader(System.in);
    static BufferedReader keyboardInput = new BufferedReader(input);

    public static void main(String[] args) throws IOException {
        // Get a string

        System.out.println("Input a string ");
        String data = keyboardInput.readLine();

        // Output number of characters in the line

        int numberCharacters = data.length();
        System.out.println("Number of characters = " +
                numberCharacters + "\n");

        // Output tokens

        for (int counter = 0; counter < numberCharacters; counter++) {
            char character = data.charAt(counter);
            if (character == ' ')
                System.out.println();
            else
                System.out.print(character);
        }
        System.out.println("\n");
    }
}