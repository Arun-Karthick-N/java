public class stat {
    public static int age = 27;
    static void disp()
    {
        System.out.println("statuc function");
    }
    public static void main(String[] args) {
        System.out.println(stat.age);
        display dis =new display();
        disp();
    }
}
class display extends stat{
    {
        age+=20;
    }
    display()
    {
        age+=10;
        System.out.println(age+20);
    }
}
