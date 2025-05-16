
import java.util.Scanner;
public class test2 {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in))
        {
            System.out.print("Enter name : ");
            String name = scan.nextLine();
            System.out.print("Enter score : ");
            float score = scan.nextFloat();
            System.out.println("my name is "+name+". my score is "+score/10+"/10");
        }
    }
}
