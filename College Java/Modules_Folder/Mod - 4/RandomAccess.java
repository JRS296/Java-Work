import java.io.*;

public class RandomAccess {

    public static void main(String[] args) {
        try {
            // file content is "ABCDEFGH"
            String filePath = "College Java/Assignments/Ass - 2/holi.txt";
            FileUtil fileUtil = new FileUtil(filePath);
            int len = fileUtil.getCharCount();
            System.out.println(new String(readCharsFromFile(filePath, 11, len)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static byte[] readCharsFromFile(String filePath, int seek, int chars) throws IOException {
        RandomAccessFile file = new RandomAccessFile(filePath, "r");
        file.seek(seek);
        byte[] bytes = new byte[chars];
        file.read(bytes);
        file.close();
        return bytes;
    }

}

class FileUtil {
    static BufferedReader reader = null;    
    public FileUtil(String filePath) throws FileNotFoundException {
       File file = new File(filePath);
       FileInputStream fileStream = new FileInputStream(file);
       InputStreamReader input = new InputStreamReader(fileStream);
       reader = new BufferedReader(input);
    }
 
    public int getCharCount() throws IOException {
       int charCount = 0;
       String data;        
       while((data = reader.readLine()) != null) {
          charCount += data.length();                        
       }            
       return charCount;
    }
 }