import java.io.File;
import java.io.IOException;

public class fio_test1 {
    public static void main(String[] args) throws IOException {

        try {
            File sat = new File("D:/CompSci - Learn/Java/College Java/Modules_Folder/Mod - 4/dummy.txt", "test.txt");
            if (sat.createNewFile()) {
                System.out.println("New File is Created");
            }
        } catch (Exception e) {
            System.out.println("Exception handled here");
        }

        try {
            File sat = new File("D:/CompSci - Learn/Java/College Java/Modules_Folder/Mod - 4/dummy.txt", "test.txt");
            if (sat.exists()) {
                System.out.println("File Exists");
            }
        } catch (Exception e) {
            System.out.println("Exception handled here");
        }

        try {
            File sat = new File("D:/CompSci - Learn/Java/College Java/Modules_Folder/Mod - 4/dummy.txt", "test.txt");
            if (sat.exists()) {
                System.out.println(sat.getPath());
            }
        } catch (Exception e) {
            System.out.println("Exception handled here");
        }

        try {
            File sat = new File("D:/CompSci - Learn/Java/College Java/Modules_Folder/Mod - 4/dummy.txt", "test.txt");
            if (sat.exists()) {
                System.out.println(sat.getParent());
            }
        } catch (Exception e) {
            System.out.println("Exception handled here");
        }

        try {
            File sat = new File("D:/CompSci - Learn/Java/College Java/Modules_Folder/Mod - 4/dummy.txt", "test.txt");
            if (sat.exists()) {
                System.out.println(sat.getName());
            }
        } catch (Exception e) {
            System.out.println("Exception handled here");
        }

        try {
            File sat = new File("D:/CompSci - Learn/Java/College Java/Modules_Folder/Mod - 4/dummy.txt", "test.txt");
            File listofcountries = new File("countries.txt");
            if (sat.exists()) {
                sat.renameTo(listofcountries);
            }
        } catch (Exception e) {
            System.out.println("Exception handled here");
        }

        try {
            File sat = new File("D:/CompSci - Learn/Java/College Java/Modules_Folder/Mod - 4/dummy.txt", "test.txt");
            if (sat.canRead()) {
                System.out.println("you can read from the file");
            }
        } catch (Exception e) {
            System.out.println("Exception handled here");
        }

        try {
            File sat = new File("D:/CompSci - Learn/Java/College Java/Modules_Folder/Mod - 4/dummy.txt", "test.txt");
            if (sat.canWrite()) {
                System.out.println("you can write to the file");
            }
        } catch (Exception e) {
            System.out.println("Exception handled here");
        }

    }
}
