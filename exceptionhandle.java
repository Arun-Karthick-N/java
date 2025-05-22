
import java.util.Scanner;

public class exceptionhandle {
    public static void main(String[] args) {
       try(Scanner scan =new Scanner(System.in)){
        int b=scan.nextInt();
        int a=10/0;
       }       
//     Scanner scan =new Scanner(System.in);
//     try{
//         int b=scan.nextInt();
//         int a=10/0;
//     }
     catch(Exception e){
         System.out.println(e);
     }
     finally{
     System.out.println("END");
   }
}
}
