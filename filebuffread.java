
import java.io.BufferedReader;
import java.io.FileReader;

public class filebuffread {
    public static void main(String[] args) {
    try {
        FileReader r =new FileReader("text1.txt");
        BufferedReader re = new BufferedReader(r);
        String c = re.readLine();
        while(c!=null){   
            System.out.println(c);
            c = re.readLine();
        }
        System.out.println("File read complete");
        re.close();
    } 
    catch (Exception e) {
        System.out.println(e);
    }        
  }
}
