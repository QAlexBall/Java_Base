package javatest10;

class FirstThread implements Runnable {
    private String threadname;
    private Thread thread;

    public FirstThread(String name) {
        thread = new Thread(this, name);
        this.threadname = name;
    }

    @Override
    public void run() {
        for(int i = 0; i < 100; i++) {
            System.out.println(threadname + ": " + i);
        }
    }
    public void start() {
        thread.start();
    }
}
public class demo {
    public static void main(String [] args) {
        FirstThread thread1 = new FirstThread("Thread1");
        FirstThread thread2 = new FirstThread("Thread2");
        thread1.start();
        thread2.start();
    }
}