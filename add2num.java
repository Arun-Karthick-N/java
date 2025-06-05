import java.util.Scanner;
public class add2num {
    public static void main(String[] args)
    {
        try(Scanner ak = new Scanner(System.in))
        {
            System.out.println("Enter the value: ");
            int a = ak.nextInt();
            int b = ak.nextInt();
            ak.nextLine();
            String s = ak.nextLine();
            System.out.println(a+b+s);
        }
    }
}
