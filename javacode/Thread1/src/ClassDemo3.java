class MyRunnable implements Runnable {
    @Override
    public void run() {
        while(true) {
            System.out.println("hello runnable");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ClassDemo3 {

    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());
        t.start();
    }

}
