public abstract class animalsuper {
    String name;
    public animalsuper(String name) {
        this.name=name;
    }
    abstract void makesound();
    public static void main(String[] args) {
        dog d = new dog("Eren");
        d.makesound();
        cat c = new cat("Mikasa");
        c.makesound();
    }
}
class dog extends animalsuper{
    dog(String name){
        super(name);
    }
    void makesound()
    {
        System.out.println(name+" Bark");
    }
}
class cat extends animalsuper{
    cat(String name){
        super(name);
    }
    void makesound()
    {
        System.out.println(name+" Meow...");
    }
}