
import java.util.Scanner;

public class applecost {
    static int cost(int cost,int count){
        return cost*count;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the count : ");
        int count=scan.nextInt();
        System.out.print("Enter the cost : ");
        int cost=scan.nextInt();
        //applecost cs=new applecost();
        System.out.print("Total count: "+cost(cost,count));
    }
}
