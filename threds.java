public class threds {
    public static void main(String[] args) {
        a a=new a();
        b b=new b();
        a.setPriority(1);
        b.setPriority(10);
        a.start();
        b.start();
    }
}

class a extends Thread{

    boolean j;
    public void run(){
        for(int i=0;i<50;i++){
            System.out.println("A class thread");
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
    }
}

class b extends Thread{
    public void run(){
        for(int j=0;j<50;j++){
            System.out.println("B class thread");
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
    }
}