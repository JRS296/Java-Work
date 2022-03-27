import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMapsAss {
    public static int y = 0;

    public static void main(String[] args) {
        char uni[] = new char[25];
        String str = "Die with memories";
        uni = unique(str);
        // System.out.println(uni);
        // System.out.println(y);
        withHash(str, uni, y);
        withoutHash(str, uni, y);
    }

    public static void withHash(String st, char x[], int len) {
        HashMap<String, List<Integer>> map = new HashMap<>();
        System.out.println("Using Hash Map: ");
        int length = st.length();
        for (int i = 0; i < len; i++) {
            List<Integer> li = new ArrayList<>();
            String ch = Character.toString(x[i]);
            li.removeAll(li);
            for (int j = 0; j < length; j++) {
                
                if (st.charAt(j) == x[i]) {;
                    li.add(j);
                }
            }
            map.put(ch, li);
        }
        System.out.println(map);
    }

    public static void withoutHash(String st, char x[], int len) {
        System.out.println("\nWithout Using Hash Map: ");
        int length = st.length();
        for (int i = 0; i < len; i++) {
            System.out.print(x[i] + ": ");
            for (int j = 0; j < length; j++) {
                if (st.charAt(j) == x[i]) {
                    System.out.print(j + " \n");
                }
            }
        }
    }

    public static char[] unique(String str) {
        char x[] = str.toCharArray();
        int n = str.length();
        y = 0;
        int index = 0;

        // Traverse through all characters
        for (int i = 0; i < n; i++) {

            // Check if str[i] is present before it
            int j;
            for (j = 0; j < i; j++) {
                if (x[i] == x[j]) {
                    break;
                }
                if (x[i] == ' ') {
                    break;
                }
            }

            // If not present, then add it to
            // result.
            if (j == i) {
                x[index++] = x[i];
                y++;
            }
        }
        return x;
    }
}
