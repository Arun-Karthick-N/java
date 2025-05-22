public class lamda {
    public static void main(String[] args) {
        ak a=new ak() {
            public void display(){
                System.out.println("without lamda");
            }
        };
        a.display();
        ak b=()->{
            System.out.println("Lamda");
        };
        b.display();
    }
}
interface ak{
    void display();
}