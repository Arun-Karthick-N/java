import java.util.Scanner;
public class test4 {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in))
        {   
            int a,sum=0;
            for(int i=0;i<5;i++)
            {
                System.out.print("Enter the score "+(i+1)+": ");
                a=scan.nextInt();
                sum+=a;
            }
            System.out.println("SUM IS : "+sum);
        }
    }
}
