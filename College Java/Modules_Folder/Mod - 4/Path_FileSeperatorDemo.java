import java.io.File;
import java.io.IOException;

public class Path_FileSeperatorDemo {
    public static void main(String[] args) {
        printFilePath("College Java/Modules_Folder/Mod - 4/dummy.txt");
        printFilePath(".." + File.separator + "dummy.txt");
    }

    public static void printFilePath(String pathname) {
        File f = new File(pathname);
        System.out.println("File Name: " + f.getName());
        System.out.println("File exists: " + f.exists());
        System.out.println("Absolute Path: " + f.getAbsolutePath());
        try {
            System.out.println("Canonical Path: " + f.getCanonicalPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
