import java.util.Scanner;
public class test5 {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            int score[]=new int[5];
            for(int i=0;i<5;i++)
                score[i]=scan.nextInt();
            for(int i=0;i<5;i++)
                System.out.println("Mark is : "+score[i]);
        }
    }
}
