
public class ThreadDemo5 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true) {
                    // 打印当前线程的名字
                    // Thread.currentThread这个静态方法，获取到当前线程实例
                    System.out.println(Thread.currentThread().getName());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, "myThread");

        t1.start();

        System.out.println("id: " + t1.getId());
        System.out.println("name: " + t1.getName());
        System.out.println("state: " + t1.getState());
        System.out.println("priority: " + t1.getPriority());
        System.out.println("isDaemon: " + t1.isDaemon());
        System.out.println("isAlive " + t1.isAlive());
        System.out.println("isInterrupted " + t1.isInterrupted());
    }
}
