public class animal {
    String name="mikasa";
    int age;
    void makesound(){
        System.out.println("Animal make sound");
    }
    public static void main(String[] args) {
        cat anm=new cat();
        anm.name="eren";
        anm.makesound();
    }
}
class dog extends animal{
    @Override
    void makesound()
    {
        System.out.println("Bark "+name);
    }
}
class cat extends animal{
    @Override
    void makesound()
    {
        System.out.println("meow... "+name);
    }
}
