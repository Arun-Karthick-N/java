public class throwss {
    public static void main(String[] args) {
        divide d=new divide();
        try {
            d.div();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
class divide{
    void div()throws Exception{
        int a=10/0;
    }
}
