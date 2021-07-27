package assignment4;
public class ChildThread implements Runnable{
    public void run() {
        Thread t=new Thread();
        for(int i=0;i<3;i++) {
            System.out.println(i + " " + t.getName());
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
