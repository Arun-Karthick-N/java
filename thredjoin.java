public class thredjoin {
    public static void main(String[] args) {
        a a=new a();
        a.start();// a class thread end here so in the next line it print 0,if we put join() then it join the thread with the main class then it shows correct output
        try {
            a.join();
        } 
        catch (InterruptedException ex) {
            System.out.println(ex);
        }
        System.out.println(a.j);
    }
}

class a extends Thread{
    int j=0;
    public void run(){    
        for(int i=0;i<50;i++){
            j=i;
        }
    }
}
