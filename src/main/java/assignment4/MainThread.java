package assignment4;
public class MainThread {
    public static void main(String[] args){
        ChildThread c1 = new ChildThread();
        ChildThread c2 = new ChildThread();
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        t1.start();
        t2.start();

    }
}
