public class thredrunnable {
    public static void main(String[] args) {
        a obj = new a();
        Thread t =new Thread(obj);
        t.start();
    }
}
class a implements Runnable{
    public void run(){
        System.out.println("CLASS A");
    }
}