
import java.io.BufferedWriter;
import java.io.FileWriter;

public class filebuffwrite2 {
    public static void main(String[] args) {
    try{
        FileWriter fl= new FileWriter("text1.txt");
        BufferedWriter ff=new BufferedWriter(fl); // in filewriter each letter is added individually but in bufferwriter whole text is stored in buffer
        ff.write("This is the text messgae"); //  and then wriiten in the txt file as a whole which is faster
        ff.newLine();
        ff.append("This is append");
        System.out.println("File written");
        ff.close();
    }
    catch(Exception e){
        System.out.println(e);
    }
  }
}