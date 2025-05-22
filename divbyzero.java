import java.util.Scanner;
public class divbyzero {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter numerator: ");
        int num=scan.nextInt();
        System.out.print("Enter Dinaminator: ");
        int div=scan.nextInt();
        division d=new division();
        d.div(num,div);
    }
    
}
class division{
    void div(int num,int din){
        try {
            int div=num/din;
            System.out.println("Division :"+div);
        } 
        catch (Exception e) {
            System.out.println("Division by zero");
        }
        finally{
            System.out.println("Program Ended");
        }
    }
}
