// Thread是Java标准库中描述的一个关于线程的类
// 常用的方法是自己定义一个类继承Thread
// 重写Thread类的run方法就表示线程要执行的具体任务
class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("hello thread");
    }
}

public class ThreadDemo1 {

    public static void main(String[] args) {
        Thread thread1 = new MyThread();
//        thread1.start();
//        thread1.run();
    }

}

