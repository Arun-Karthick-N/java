
import java.util.Scanner;

public class agevalid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the age: ");
        try{
            int age=scan.nextInt();
            agechecker ck = new agechecker();
            ck.check(age);
        }
        catch(Exception e){
            System.out.println(e);
        }
        

    }
}
class agechecker{
    void check(int age){
        try{
        if(age<1 || age>120)
            throw new age_limit_exceded("Check the entered age");
        else System.out.println("Valid age");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
class age_limit_exceded extends Exception{
    age_limit_exceded(String s){
        super(s);
    }
}