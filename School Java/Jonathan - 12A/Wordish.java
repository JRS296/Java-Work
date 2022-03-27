
public class Wordish 
{
    public static void main(String[] args) {
        System.out.println("testing elfish:");
        System.out.printf("elfish(\"whiteleaf\") is %b.\n", elfish("whiteleaf"));
        System.out.printf("elfish(\"Java\") is %b.\n\n", elfish("Java"));
        System.out.println("testing x_ish:");
        System.out.printf("x_ish(\"left\", \"rightfullness\") is %b.\n", x_ish("left", "rightfullness"));
        System.out.printf("x_ish(\"left\", \"shelf\") is %b.\n\n", x_ish("left", "shelf"));
        String[] s = {"this", "stressful", "time", "on", "the",
                "twelfth", "felt", "strangely", "uneventful"};
        System.out.println("testing keep_leftish:");
        System.out.printf("keep_leftish(s) returns %s.\n", keep_leftish(s));
    }
    // a NON-recursive method to check whether word contains the letters of e, l, and f.
    public static boolean elfish(String word) {
        ... ...
    }
    // check whether word contains all the letters of the given word x
    public static boolean x_ish(String x, String word) {
        return x_ish_check(x, x.length(), word);
    }
    // a RECURSIVE method to check whether word contains
    // all the first n letters of the given word x
    private static boolean x_ish_check(String x, int n, String word) {
        ... ...
    }
    // This method finds all the leftish words in the array s
    // and return a string of all the found words concatenated.
    public static String keep_leftish(String[] s) {
        return get_leftish(s, s.length);
    }
    // This RECURSIVE method finds all the leftish words among the first n words of array s
    // and return a string of all the found words concatenated.
    private static String get_leftish(String[] s, int n) {
        ... ...
    }
}