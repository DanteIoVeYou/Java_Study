package java_20220712;

class MyThread extends Thread{
    @Override
    public void run() {
        while(true) {
            System.out.println("hello thread!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class ThreadDemo1 {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.run();

        while(true) {
            System.out.println("hello main");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
