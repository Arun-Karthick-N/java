
import java.util.Scanner;

public class throv {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            int age=scan.nextInt();
            if (age<1){
                throw new Exception("AGE not less than one");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        finally{
            System.out.println("END");
        }
    }
}
