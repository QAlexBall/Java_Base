/**
 * Author: QAlexBall
 * Data: 2017/11/28
 * Content: demo for thread with runnable and entends Thread
 */
package Other_Example;

/**
 * Runnalbe
 */
class ThreadA implements Runnable {
    private Thread thread;
    private String threadName;

    public ThreadA(String threadName) {
        thread = new Thread(this, threadName);
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(threadName + " : " + i);
        }
    }

    public void start() {
        thread.start();
    }
}
/**
 * extends class Thread
 */
class ThreadB extends Thread {
    private String threadName;

    public ThreadB(String threadName) {
        super(threadName);
        this.threadName = threadName;
    }
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(threadName + " : " + i);
        }
    }

}

public class Thread_Demo1 {
    public static void main(String[] args) {
        ThreadA threadA = new ThreadA("ThreadA");
        ThreadB threadB = new ThreadB("ThreadB");
        threadA.start();
        threadB.start();
    }
}
