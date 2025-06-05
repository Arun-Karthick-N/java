import java.util.Scanner;

public class crtexception {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            int age=scan.nextInt();
            if (age<1){
                throw new age_Exception_error("AGE not less than one ");
            }
        } catch (Exception e) {
            System.out.println("ERROR:"+e);
        }
        finally{
            System.out.println("END");
        }
    }
}
class age_Exception_error extends Exception{
    age_Exception_error(String s){
        super(s);
        System.out.println(s);
    }
}
