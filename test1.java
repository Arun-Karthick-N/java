import java.util.Scanner;
public class test1 {
    public static void main(String[] args) {
        try(Scanner ak = new Scanner(System.in))
        {
            System.out.print("Enter age : ");
            int age = ak.nextInt();
            ak.nextLine();
            System.out.print("Enter name : ");
            String name = ak.nextLine();
            System.out.print("Enter address : ");
            String address = ak.nextLine();
            System.out.print("my name is "+name+" my age is "+age+" my address is "+address);
        }
    }
}
