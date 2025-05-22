public class doc  {
    
    public static void main(String[] args) {
        document d=new document();
        d.prin();d.show();d.play();
    }
}
interface playable{
    void play();
}
interface showable{
    void show();
}
interface printable{
    void prin();
}
class document implements playable,showable,printable{
    @Override public void play()
    {
        System.out.println("play");
    }
    @Override public void show()
    {
        System.out.println("show");
    }
    @Override public void prin()
    {
        System.out.println("print");
    }
}
