
import java.io.FileWriter;

public class filewrite {
    public static void main(String[] args) {
    try{
        FileWriter fl= new FileWriter("text.txt");
        fl.write("This is the text messgae");
        System.out.println("File written");
        fl.close();
    }
    catch(Exception e){
        System.out.println(e);
    }
  }
}