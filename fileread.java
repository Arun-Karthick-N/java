
import java.io.FileReader;

public class fileread {
    public static void main(String[] args) {
    try {
        FileReader r =new FileReader("text.txt");
        int c = r.read();
        while(c!=-1){   
            System.out.print((char) c);
            c = r.read();
        }
        System.out.println("");
        System.out.println("File read complete");
        r.close();
    } 
    catch (Exception e) {
        System.out.println(e);
    }        
  }
}
