public class animal {
    String name="mikasa";
    int age=27;
    void makesound(){
        System.out.println("Animal make sound");
    }
    public static void main(String[] args) {
        cat anm=new cat();
        anm.name="eren";
        anm.makesound();
        dog an = new dog();
        an.makesound();
    }
}
class dog extends animal{
   // int age;
    @Override
    void makesound()
    {
        System.out.println("Bark "+name+" "+age);
    }
}
class cat extends animal{
    @Override
    void makesound()
    {
        System.out.println("meow... "+name+" "+age);
    }
}
